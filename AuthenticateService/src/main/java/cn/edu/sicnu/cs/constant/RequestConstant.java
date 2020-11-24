package cn.edu.sicnu.cs.constant;

/**
 * @Classname RequestConstant
 * @Description TODO
 * @Date 2020/11/22 1:02
 * @Created by Huan
 */
public class RequestConstant {
    public static final String POST="POST";
    public static final String DELETE="DELETE";
    public static final String PUT = "PUT";
    public static final String GET = "GET";

    public static boolean isLegalHttpMethod(String method){
        return POST.equals(method) || DELETE.equals(method)
                || PUT.equals(method)|| GET.equals(method);
    }
}
