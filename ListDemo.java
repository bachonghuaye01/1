import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] arges){
        List<Integer> list = new ArrayList<>();
        while(true){
            //产生随机数
            int num = (int)(Math.random()*10+1);
            //判断当前元素在容器中是否存在
            if(list.contains(num)){
                list.add(num);
            }
            //结束循环
            if(list.size() == 10){
                break;

            }

        }
        for(Integer i:list){
            System.out.println(i);
        }

    }

}
