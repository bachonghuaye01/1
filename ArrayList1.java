import java.util.List;

public class ArrayList1 {
    public class ArrayList {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            boolean person = list.add("eye");
            boolean person1 = list.add("nose");
            boolean person2 = list.add("mouth");
            boolean person3 = list.add("hair");

            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }

            System.out.println(person);

            System.out.println("---------------------------------------");
            person3 = list.remove("hair");
            System.out.println(person3);
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }

        }

    }
}
