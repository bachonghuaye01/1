import java.util.ArrayList;

public class pxh {

        public static void main(String [] args){
            Person jack = new Person ();
            jack.setId(0);
            jack.setName("jack");
            jack.setAge(20);
            Person tom = new Person ();
            tom.setId(1);
            tom.setName("tom");
            tom.setAge(20);
            Person john = new Person ();
            john.setId(2);
            john.setName("john");
            john.setAge(20);

            ArrayList<Person> personList = new ArrayList<>();
            personList.add(jack);
            personList.add(tom);
            personList.add(john);

            for (Person person:personList) {
                if (person.getId()==0){
                    personList.remove(person);
                }

            }
            for (Person person:
                    personList) {
                System.out.println("ID:"+person.getId()+"NAME:"+person.getName()+"AGE:"+person.getAge());
            }
        }
    }

