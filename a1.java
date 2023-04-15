import java.util.ArrayList;

public class a1 {
        public static void main(String[] args) {
            Person jack = new Person();
            //类名 对象名 = 生成对象 ()为空构造器,构造器默认存在;
            jack.setId(0);
            jack.setName("jack");
            jack.setAge(21);


            Person tom = new Person();
            tom.setId(1);
            tom.setName("tom");
            tom.setAge(22);

            Person john = new Person();
            john.setId(2);
            john.setName("john");
            john.setAge(23);

            Person jerry = new Person();
            jerry.setId(3);
            jerry.setName("jerry");
            jerry.setAge(24);

            Person David = new Person();
            David.setId(4);
            David.setName("David");
            David.setAge(25);

            ArrayList<Person> personList = new  ArrayList<>();
            personList.add(jack);
            personList.add(tom);
            personList.add(john);
            personList.add(jerry);
            personList.add(David);

            for (int i = 0; i < personList.size()-1; i++){
                if (personList.get(i).getId()==3){
                    personList.remove(personList.get(i));

                }

            }

            for (Person person:
                personList){
                System.out.println("ID"+person.getId()+"NAME"+person.getName()+"AGE"+person.getAge());
            }

                }

            }

