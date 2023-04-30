import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] arges){
        Set<Integer> set = new HashSet<>();
        while (true){
            int num = (int)(Math.random()*10+1);
            set.add(num);
        //将元素添加到容器中，由于Set类型容器不允许有重复元素，所以不需要判断
            set.add(num);
        //结束循环
            if(set.size() == 10){
            break;
            }
        }
    for (Integer i:set){
        System.out.println(i);
    }
    //结果为12345678910，HashSet不排序，出现该结构的原因是“假排序”
      //数组的初始长度是16，所以在用小于16的数去模时，1%16=0...1，商为0，余数为数字本身，而 HashSet 底层是数组+链表，所以会按顺序输出元素本身，实际并没有做排序
    }
}
