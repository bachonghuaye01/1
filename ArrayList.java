import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList1<>();
        //java: 无法推断ArrayList1的类型参数
        //  原因: 无法将 '<>' 与非泛型类ArrayList1一起使用
        boolean id = list.add("Person.this.id");
        boolean name = list.add("Person.this.name");
        boolean age = list.add("Person.this.age");

    }


}