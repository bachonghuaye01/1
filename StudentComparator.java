import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    //定义比较规则
    @Override
    public int compareTo(Student o1,Student o2){
        if(o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }

    //compareTo 它不是元素自身的，需要两个元素来做比较，所以只能依赖于把两个元素传递过来再做比较
    //这也是他跟自身元素比较的一个区别，他是需要两个元素的
}
