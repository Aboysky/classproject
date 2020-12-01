package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.anotations.Log;
import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.pojo.*;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.PrigroupService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.utils.PageRequest;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/11/15 16:45
 * @Created by Huan
 */
@RestController
@Api(value = "user",tags = "user",description = "系统外部用户接口")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    PrigroupService prigroupService;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    MetaOperationService metaOperationService;

//
//    @RequestMapping(method = PUT)
//    @ApiOperation(value = "Update an existing pet",
//            authorizations = @Authorization(value = "petstore_auth", scopes = {
//                    @AuthorizationScope(scope = "write_pets", description = ""),
//                    @AuthorizationScope(scope = "read_pets", description = "")
//            }))
//    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID supplied"),
//            @ApiResponse(code = 404, message = "Pet not found"),
//            @ApiResponse(code = 405, message = "Validation exception")})

    /**
     * 更改用户密码 要做 ------------------------------->>>>>>>>>>>>>>>>>>>>>
     * @param uid
     * @param request
     * @return
     * @throws IOException
     */

    @Log("更新用户信息")
    @PutMapping("${soft_version}/user/{uid}")
    @ApiOperation(value = "update_user_info",tags = "user",notes = "改变用户信息")
    public String updateUser(@PathVariable Integer uid, HttpServletRequest request) throws IOException {

        /**
         * 更改用户密码
         */

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String username = null,urealname = null,ugender = null,
                uemail = null,umobile = null,oldpassword = null,newpassword = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            username = jsonObject.getString("username");
            urealname = jsonObject.getString("urealname");
            ugender = jsonObject.getString("ugender");
            uemail = jsonObject.getString("uemail");
            umobile = jsonObject.getString("umobile");
            oldpassword = jsonObject.getString("oldpassword");
            newpassword = jsonObject.getString("newpassword");
        }

        if (StringUtils.hasText(oldpassword)&&StringUtils.hasText("newpassword")){
            oldpassword=passwordEncoder.encode(oldpassword);
            newpassword=passwordEncoder.encode(newpassword);
            try {
                int i = userService.updatePasswordByUid(uid, oldpassword, newpassword);
                if (i>=1){
                    return ResUtil.getJsonStr(ResultCode.OK,"修改密码成功");
                }else return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "旧密码不正确");
            } catch (Exception e) {
                e.printStackTrace();
                return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "旧密码不正确");
            }

        }else if (StringUtils.hasText(oldpassword)||StringUtils.hasText(newpassword)||
                (StringUtils.isEmpty(oldpassword)&&StringUtils.hasText(newpassword))||
                (StringUtils.isEmpty(newpassword)&&StringUtils.hasText(oldpassword))){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR,"修改密码时字段必须有新旧密码");
        }else{
            oldpassword=null;
            newpassword=null;
        }

        if (!StringUtils.isEmpty(username)||!StringUtils.isEmpty(urealname)
        ||!StringUtils.isEmpty(ugender)||!StringUtils.isEmpty(uemail)
                ||!StringUtils.isEmpty(umobile)){
            User user = new User(username,urealname,ugender,uemail,umobile);
            user.setUid(uid);

            try {
                int i = userService.updateUserByUid(uid, user);
                if (i == 0){
                    return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");
                }else{
                    return ResUtil.getJsonStr(ResultCode.OK, "更新成功");
                }
            }catch (Exception e){
                e.getStackTrace();
                ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");
            }

        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");

    }

    //  管理员更改其他用户信息   管理员密码
    @Log("管理员对员工信息进行了修改")
    @PutMapping("${soft_version}/admin/{uid}")
    @ApiOperation(value = "update_user_info",tags = "user",notes = "改变用户信息")
    public String updateUserByAdmin(@PathVariable Integer uid, HttpServletRequest request) throws IOException {

        /**
         * 更改用户密码
         */

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String username = null,urealname = null,ugender = null,
                uemail = null,umobile = null,adminPassword = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            username = jsonObject.getString("username");
            urealname = jsonObject.getString("urealname");
            ugender = jsonObject.getString("ugender");
            uemail = jsonObject.getString("uemail");
            umobile = jsonObject.getString("umobile");
            adminPassword = jsonObject.getString("adminpassword");
        }

//        if (StringUtils.hasText(oldpassword)&&StringUtils.hasText("newpassword")){
//            oldpassword=passwordEncoder.encode(oldpassword);
//            newpassword=passwordEncoder.encode(newpassword);
//            try {
//                int i = userService.updatePasswordByUid(uid, oldpassword, newpassword);
//                if (i>=1){
//                    return ResUtil.getJsonStr(ResultCode.OK,"修改密码成功");
//                }else return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "旧密码不正确");
//            } catch (Exception e) {
//                e.printStackTrace();
//                return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "旧密码不正确");
//            }
//
//        }else if (StringUtils.hasText(oldpassword)||StringUtils.hasText(newpassword)||
//                (StringUtils.isEmpty(oldpassword)&&StringUtils.hasText(newpassword))||
//                (StringUtils.isEmpty(newpassword)&&StringUtils.hasText(oldpassword))){
//            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR,"修改密码时字段必须有新旧密码");
//        }else{
//            oldpassword=null;
//            newpassword=null;
//        }
        System.out.println("-------------->>>>"+userService.selectUserByUsername("admin1").getPassword());
        System.out.println("--------------->>>"+adminPassword);

        if (passwordEncoder.matches(adminPassword,userService.selectUserByUsername("admin1").getPassword())){
            if (!StringUtils.isEmpty(username)||!StringUtils.isEmpty(urealname)
                    ||!StringUtils.isEmpty(ugender)||!StringUtils.isEmpty(uemail)
                    ||!StringUtils.isEmpty(umobile)){
                User user = new User(username,urealname,ugender,uemail,umobile);
                user.setUid(uid);
                try {
                    int i = userService.updateUserByUid(uid, user);
                    if (i == 0){
                        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");
                    }else{
                        return ResUtil.getJsonStr(ResultCode.OK, "更新成功");
                    }
                }catch (Exception e){
                    e.getStackTrace();
                    ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");
                }

            }
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");

        }else return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "管理员密码错误");


    }

    @Log("添加用户")
    @PostMapping("${soft_version}/user")
    @ApiOperation(value = "add_user",tags = "user",notes = "添加用户")
    public String addUser(HttpServletRequest request) throws IOException {

        /**
         * 唯一主键的都需要判定
         */
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String username = null,urealname = null,ugender = null,
                uemail = null,umobile = null,password = null,
                uroleId = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            username = jsonObject.getString("username");
            urealname = jsonObject.getString("urealname");
            ugender = jsonObject.getString("ugender");
            uemail = jsonObject.getString("uemail");
            umobile = jsonObject.getString("umobile");
            password = jsonObject.getString("password");
            uroleId = jsonObject.getString("uroleId");
        }
        ugender="f";
        uroleId="1";
        if (StringUtils.isEmpty(username)||StringUtils.isEmpty(urealname)||
                StringUtils.isEmpty(ugender)||StringUtils.isEmpty(uemail)||
                StringUtils.isEmpty(umobile)||StringUtils.isEmpty(password)||
                StringUtils.isEmpty(uroleId)){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"创建用户时必要参数不能为空");
        }

        if (StringUtils.hasText(ugender)&&!(ugender.toLowerCase().equals("f")||ugender.toLowerCase().equals("m"))){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR, "性别必须为f或者m");
        }
        if (StringUtils.hasText(ugender)){
            ugender=ugender.toLowerCase();
        }
        if (StringUtils.hasText(username)){
            User user = userService.selectUserByUsername(username);
            if (user!=null){
                return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST, "用户名已经存在");
            }
        }
        if (umobile.toCharArray().length!=11){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR, "手机号格式不正确");
        }
        Role role = roleService.selectByPrimaryKey(Integer.parseInt(uroleId));
        if (role==null){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR, "赋予用户的角色不存在");
        }

        User user = new User(username,urealname,ugender,uemail,umobile);
        user.setUroleId(Integer.valueOf(uroleId));
        user.setPassword(passwordEncoder.encode(password));
        user.setUvisits(0);
        user.setUlocked("0");
        user.setUdeleted("0");

        System.out.println("--------------->"+user);

        try{
            int i = userService.insertUser(user);
            if (i == 0){
                return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "创建用户,传入参数错误");
            }else{
                User user1 = userService.selectUserByUsername(username);
                user1.setPassword(null);
                return ResUtil.getJsonStr(ResultCode.OK, "创建用户成功",user1);
            }
        }catch (Exception e){
//            logger
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST, "用户名或者手机号已经存在");
        }

    }
    @Log("删除用户")
    @DeleteMapping("${soft_version}/user/{uid}")
    @ApiOperation(value = "delete_user",tags = "user",notes = "删除用户")
    public String deleteUser(@PathVariable("uid") Integer uid) throws IOException {
        if (uid==null||uid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id参数不正确");
        }
        User user = userService.selectUserByUid(uid);
        if (user==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        int i = 0;
        try {
            i = userService.deleteUserByUid(uid);
        } catch (SQLIntegrityConstraintViolationException throwables) {
            throwables.printStackTrace();
            return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "删除失败");
        }
        if (i == 0){
            return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "删除失败");
        }else{
            return ResUtil.getJsonStr(ResultCode.OK, "删除用户成功");
        }
    }
    @Log("查询用户")
    @GetMapping("${soft_version}/user/{uid}")
    @ApiOperation(value = "select_user",tags = "user",notes = "查询用户")
    public String selectUser(@PathVariable("uid") Integer uid) throws IOException {
        if (uid==null||uid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id参数不正确");
        }
        User user = userService.selectUserByUid(uid);
        if (user==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        user.setPassword(null);
        ReturningUser returningUser = new ReturningUser(user,roleService.selectByPrimaryKey(user.getUroleId()).getRdesc());
        return ResUtil.getJsonStr(ResultCode.OK, "查询用户成功",returningUser);
    }

    @GetMapping("${soft_version}/_users")
    @ApiOperation(value = "select_all_user",tags = "user",notes = "查询所有用户")
    public String selectAllsysUser() throws IOException {
        List<User> users = userService.selectAllSysUser();
        List<ReturningUser> returningUsers = new ArrayList<>();
        if (users.isEmpty()){
            return ResUtil.getJsonStr(ResultCode.OK, "查询用户成功",null);
        }
        for (User user : users) {
            user.setPassword(null);
            returningUsers.add(new ReturningUser(user,roleService.selectByPrimaryKey(user.getUroleId()).getRdesc()));
        }
        return ResUtil.getJsonStr(ResultCode.OK, "查询用户成功",returningUsers);
    }


    @GetMapping("${soft_version}/user/{uid}/_privs")
    @ApiOperation(value = "select_user_privs",tags = {"user","privs"},notes = "查询用户的所有权限")
    public String selectUserPrivs(@PathVariable("uid") Integer uid) throws IOException {
        if (uid==null||uid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id参数不正确");
        }
        User user = userService.selectUserByUid(uid);
        if (user==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        List<Metaoperation> metaoperations = roleService.selectPrivilegesByRid(user.getUroleId());

        return ResUtil.getJsonStr(ResultCode.OK, "查询用户成功",metaoperations);
    }

    @PutMapping("${soft_version}/user/{uid}/role")
    @ApiOperation(value = "update_user_role",tags = "user",notes = "改变用户角色")
    public String updateUserRole(@PathVariable Integer uid, HttpServletRequest request) throws IOException {
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String uroleId = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            uroleId = jsonObject.getString("uroleId");
        }
        User user = new User();

        if (uroleId==null||uroleId.isEmpty()){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id不正确");
        }
        user.setUroleId(Integer.valueOf(uroleId));

        User user1 = userService.selectUserByUid(uid);
        if (user1==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        try {
            int i = userService.updateUserByUid(uid, user);
            if (i == 0){
                return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "更新失败,传入参数错误");
            }else{
                User user2 = userService.selectUserByUid(uid);
                user2.setPassword(null);
                return ResUtil.getJsonStr(ResultCode.OK, "更新成功",user2);
            }
        }catch (Exception e){
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST, "更新失败,更新内容与其他用户重复");
        }
    }

    @GetMapping("${soft_version}/user/{uid}/_navbar")
    @ApiOperation(value = "select_user_privs",tags = {"user","privs"},notes = "查询用户的所有权限")
    public String selectUserBar(@PathVariable("uid") Integer uid) throws IOException {
        if (uid==null||uid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id参数不正确");
        }
        User user = userService.selectUserByUid(uid);
        if (user==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        List<NavigationBar> navigationBars = userService.selectNavigationBarByUsername(user.getUsername());
        System.out.println(navigationBars);
        return ResUtil.getJsonStr(ResultCode.OK, "查询用户成功",navigationBars);
    }

    @GetMapping("${soft_version}/user/{uid}/_navbarchildren")
    @ApiOperation(value = "select_user_privs",tags = {"user","privs"},notes = "查询用户的所有权限")
    public String selectUserBarChildren(@PathVariable("uid") Integer uid,HttpServletRequest request,@RequestParam("privid") String privid) throws IOException {

        /**
         * 唯一主键的都需要判定
         */
//        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
//        String privid = null;
//        if (StringUtils.hasText(body)){
//            JSONObject jsonObject = JSON.parseObject(body);
//            privid = jsonObject.getString("privid");
//        }

        if (privid==null||privid.isEmpty()){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "导航栏id不能为空");
        }
        if (uid==null||uid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "用户id参数不正确");
        }
        User user = userService.selectUserByUid(uid);
        if (user==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "没有id为 "+uid+" 的用户");
        }
        List<NavigationBarChilren> navigationBarChilrens = userService.selectNavigationBarChildrenByUsername(user.getUroleId(),Integer.valueOf(privid));

        return ResUtil.getJsonStr(ResultCode.OK, "查询二级导航栏成功",navigationBarChilrens);
    }

    @GetMapping(value="/{soft_vesion}/_users/findpage")
    public Object findPage(@RequestParam("pageSize") Integer pageSize,@RequestParam("pageNum") Integer pageNum) {

        PageRequest pageRequest = new PageRequest();
        pageRequest.setPageNum(pageNum);
        pageRequest.setPageSize(pageSize);
        PageResult page = userService.findPage(pageRequest);
        List<ReturningUser> returningUsers = new ArrayList<>();
        if(page!=null){

            for (Object o : page.getContent()) {
                if (o!=null){
                    o = (User) o;
                    ((User) o).setPassword(null);
                    returningUsers.add(new ReturningUser((User)o,roleService.selectByPrimaryKey(((User) o).getUroleId()).getRdesc()));
                }
            }
        }
        if (page != null){
            page.setContent(returningUsers);
            page.setCode(200);
            return page;
        }
        page = new PageResult();
        page.setCode(400);
        return page;
    }

    @GetMapping("/{soft_vesion}/_users/_privs")
    public String get_All_User_Privs_By_PrivGroup(){

        List<Role> roles = roleService.selectAllRoles();
        for (Role role : roles) {
            String name= role.getRname();
            role.setRname(role.getRdesc());
            role.setRdesc(name);
        }
        List<ReturningPrivGroupWithPriv> returningPrivGroupWithPrivs = new ArrayList<>();
        List<ReturningRoleWithprivsgroup> returningRoleWithprivsgroups = new ArrayList<>();
        List<ReturningPriv> returningPrivs = new ArrayList<>();
        List<Prigroup> prigroups = prigroupService.selectAll();

        for (Role role :roles) {
            for (Prigroup prigroup : prigroups){
                if (prigroup!=null&&role!=null){
                    List<Metaoperation> metaoperations = prigroupService.selectinaprivgoupprivsbyrole(prigroup.getPgid(), role.getRid());
                    returningPrivGroupWithPrivs.add(new ReturningPrivGroupWithPriv(prigroup,metaoperations));
                }
            }
            if (role!=null){
                System.out.println("----------->"+returningPrivGroupWithPrivs);
                returningRoleWithprivsgroups.add(new ReturningRoleWithprivsgroup(role,returningPrivGroupWithPrivs));

            }
            returningPrivGroupWithPrivs.clear();
        }
        System.out.println("------------->"+returningRoleWithprivsgroups);
        return ResUtil.getJsonStr(ResultCode.OK, "请求成功",returningRoleWithprivsgroups);
    }

//    @GetMapping("/{soft_vesion}/_privgroups/_privs")
//    public String get_All_Privgroup_Privs_By_PrivGroup(){
//        List<ReturningPrivGroupWithPriv> returningPrivGroupWithPrivs = new ArrayList<>();
//        List<Prigroup> prigroups = prigroupService.selectAll();
//        for (Prigroup prigroup : prigroups) {
//            if (prigroup!=null){
//                List<Metaoperation> metaoperations = prigroupService.selectPrivilegesByPrimaryKey(prigroup.getPgid());
//                returningPrivGroupWithPrivs.add(new ReturningPrivGroupWithPriv(prigroup,metaoperations));
//            }
//        }
//
//        return ResUtil.getJsonStr(ResultCode.OK, "请求成功",returningPrivGroupWithPrivs);
//    }
    @GetMapping("/{soft_vesion}/_privgroups/_privs")
    public String get_All_Privgroup_Privs_By_PrivGroup(){
        List<ReturningPrivGroupWithPrivsFourLever> returningPrivGroupWithPrivs = new ArrayList<>();
        List<Prigroup> prigroups = prigroupService.selectAll();
        for (Prigroup prigroup : prigroups) {
            if (prigroup!=null){
                List<ReturningPrivFourLevel> returningPrivFourLevels = prigroupService.selectAllFourLever(prigroup);
                returningPrivGroupWithPrivs.add(new ReturningPrivGroupWithPrivsFourLever(prigroup.getPgid(),prigroup.getPrigroupname(),prigroup.getPrigroupdesc(),returningPrivFourLevels));
            }
        }
        return ResUtil.getJsonStr(ResultCode.OK, "请求成功",returningPrivGroupWithPrivs);
    }

    @GetMapping("/{soft_vesion}/_roles/_groupprivs")
    public String get_all_Privs_Four_Lever_By_PrivGroup(){

        List<Role> roles = roleService.selectAllRoles();
        for (Role role : roles) {
            String name= role.getRname();
            role.setRname(role.getRdesc());
            role.setRdesc(name);
        }
//        List<ReturningPrivGroupWithPrivsFourLever> returningPrivGroupWithPrivs = new ArrayList<>();
        List<ReturningRoleWithprivgroupFourLever> returningRoleWithprivsgroups = new ArrayList<>();
        List<ReturningPrivFourLevel> privFourLevels = new ArrayList<>();
        List<ReturningPriv> returningPrivs = new ArrayList<>();
        List<Prigroup> prigroups = prigroupService.selectAll();

        for (Role role :roles) {
            List<ReturningPrivGroupWithPrivsFourLever> returningPrivGroupWithPrivs = new ArrayList<>();
            for (Prigroup prigroup : prigroups){
                if (prigroup!=null&&role!=null){
                    List<ReturningPrivFourLevel> returningPrivFourLevels = metaOperationService.selectPrivFourLeverByRoleAndPrivgroup(role,prigroup);
                    returningPrivGroupWithPrivs.add(new ReturningPrivGroupWithPrivsFourLever(prigroup,returningPrivFourLevels));
                }
            }
            if (role!=null){
                System.out.println("----------->"+returningPrivGroupWithPrivs);
                System.out.println(">>--------"+returningRoleWithprivsgroups);
                returningRoleWithprivsgroups.add(new ReturningRoleWithprivgroupFourLever(role,returningPrivGroupWithPrivs));
                System.out.println(">>--------"+returningRoleWithprivsgroups);
            }
//            returningPrivGroupWithPrivs.clear();
        }
        System.out.println("------------->"+returningRoleWithprivsgroups);
//
//       return ResUtil.getJsonStr(ResultCode.OK, "请求成功",returningRoleWithprivsgroups);
        if (returningRoleWithprivsgroups!=null||!returningRoleWithprivsgroups.isEmpty()){
            returningRoleWithprivsgroups.remove(0);
        }
        return ResUtil.getJsonStrJackon(ResultCode.OK, "请求成功",returningRoleWithprivsgroups);
    }

    @GetMapping("/{soft_vesion}/user/{userid}/{groupid}/{zibiaotiid}")
    public String select_user_group_zibiaoti(@PathVariable("userid") Integer userid,
                                             @PathVariable("groupid") Integer groupid,
                                             @PathVariable("zibiaotiid") Integer zibiaotiid) {

        User user = userService.selectUserByUid(userid);

        List<Metaoperation> metaoperations = prigroupService.selectInAPrivGoupprivsByRoleAndFourlever(groupid,user.getUroleId(), zibiaotiid);
        Map<String,Boolean> map = new HashMap<>();
        for (Metaoperation metaoperation : metaoperations) {
            map.put(metaoperation.getModesc(), true);
        }
        return ResUtil.getJsonStr(ResultCode.OK,"查询成功",map);
    }
}
