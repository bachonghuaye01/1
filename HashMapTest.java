import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args){
        //实例化 HashMap 容器
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("a","A");
        String value = map.put("a","B"); //因为 a 在容器中已经存在，所以 B 会把 A 覆盖掉，同时会把 A 返回
        System.out.println(value);

        String val = map.get("a");
        System.out.println(val);

        //方式二 keySet
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");
        map.put("e","E");

        //获取 HashMap 容器中所有的元素，可以使用keySet 方法与 get 方法一并完成

        Set<String> keys = map.keySet();
        //获取HashMap容器中所有元素的key

        //遍历 Set 取得其中的每一个 key，再使用 get 方法通过 key 获取 value
        for (String key:keys){
             String v1 = map.get(key);
             System.out.println(key+" ------ "+v1);
        }

        //key 不允许有重复的，但 value 允许

        //方式三 通过 entrySet 方法获取 Map.Entry 类型获取元素

        //Entry 是内部接口，想要使用需要 (外部接口.内部接口)
        //这里定义一个名为 entrySet 的变量，然后通过 map 对象调用它
        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        //遍历这个 Set 得到 Map.Entry 类型的对象，再通过这个对象调用 key 和 getvalue 就可以获取元素的 key 和 value了
        for(Map.Entry<String,String>entry:entrySet){
            String Key = entry.getKey();
            String  v  = entry.getValue();
            System.out.println(Key+" ------ "+v);

        }


    }

}
