package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname Operation
 * @Description TODO
 * @Date 2020/11/16 14:59
 * @Created by Huan
 */
public interface MetaOperationService {

    /**
     * 查询所有权限
     * @return 权限列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation>  selectAll();

    /**
     * 根据权限操作id删除元操作权限
     * @param id 权限id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByPrimaryKey(Integer id);

    /**
     * 通过元权限操作名删除对应的元操作权限
     * @param operationName 元操作权限名
     * @return 是否插入成功
     */
    @Transactional
    int deleteByOperationName(String operationName);

    /**
     * 插入元操作权限
     * @param record 待插入的元操作权限
     * @return 是否插入成功
     */
    @Transactional
    int insert(Metaoperation record);

    /**
     * 根据元操作权限id得到元权限对象
     * @param id 元权限id
     * @return 元权限对象
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Metaoperation selectByPrimaryKey(Integer id);

    /**
     * 得到operation对象通过operationName
     * @param operationName 元操作名称
     * @return 元操作对象
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Metaoperation selectByOperationName(String operationName);


    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectAllHeadNavBar();

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectAllChildNavBarByHead(String headname);

    /**
     * 通过操作id更新元权限
     * @param record 待更新元权限对象
     * @return 是否更新成功
     */
    @Transactional
    int updateByPrimaryKey(Metaoperation record);

    /**
     * 根据元操作名更改元操作的其他信息
     * @param operationName 元操作名
     * @param record 待更新对象
     * @return 是否更新成功
     */
    @Transactional
    int updateByOperationName(String operationName,Metaoperation record);

}
