import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //实例化 TreeSet
        Set<String> set = new TreeSet()；

        //添加元素
        set.add("c");
        set.add("a");
        set.add("d");
        set.add("b");
        set.add("a");

       // String 类（ Inteagr类 也可以）实现了名为 Comparable<String> 的接口，接口中包含 compareto(String anotherString)（比较两个字符串的字典）


        for(String str :set){
            System.out.println(str);


            Set<Users> set1 = new TrssSet<>();
            Users u = new users(username='oldlu',userage=18);
            Users u1 = new users(username='admin',userage=22);
            /*Users u2 = new users(username='sxt',userage=22);*/
            set1.add(u);
            set1.add(u1);
            /*set1.add(u2);*/
            for(Users users:set1){
                System.out.println(users);
            }
            //这里会报异常，无法转换成 Comparable接口。因为现在在 TrssSet 中存放 Users 时并没有给它排序规则，（无论是自身的比较规则还是外部的比较器，都没有给它）

            //在定义了 例：按照年龄排序 的内容后就不会再报错
            //返回
            users{username='oldlu',userage=18}
            users{username='admin',userage=22}
            //即按年龄从小到大排序的排序规则

            //在需要通过姓名做比较，并添加了 u2 的情况下
            //返回
            users{username='oldlu',userage=18}
            users{username='admin',userage=22}
            users{username='sxt',userage=22}
            //即按年龄和姓名从小到大从前到后的排序规则

        }
    }
}
