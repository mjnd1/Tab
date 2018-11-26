package utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 57751 on 2018/11/21.
 * 作者
 * 邮箱
 * 作用:Tab导航上面的文字或者图片
 */

public class ItHqAddTitle {
    /**当去创建Tab的页面名称时使用的是string，但是我们需要的是List
     *所以需要把string转换成List，
     * 还有一点，就是不确定你想创建多少个Title，所以传入的参数定义为（String ... a）
     * 这样就可以随意的传参数了
     */
    public static List<String> addTitle(String ... a){
        String[] title = a;
        List<String> list = Arrays.asList(title);
        return list;
    }
}
