import com.sun.org.apache.xpath.internal.objects.XString;

public class Person {

    private int id;
    private String name;
    private int age;

    public void ren() {
        System.out.println("Person.ren");
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }

    private class person1 {
        private int id = 0;

        private String name = "jack";
        private int age = 20;

        public void ren() {
            System.out.println("Inner.ren");
            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
        }
    }
    private class person2 {
        private int id = 1;

        private String name = "tanaka";
        private int age = 21;

        public void ren() {
            System.out.println("Inner.ren");
            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
        }
    }
    private class person3 {
        private int id = 2;

        private String name = "yamada";
        private int age = 22;

        public void ren() {
            System.out.println("Inner.ren");
            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
        }
    }
    private class person4 {
        private int id = 3;

        private String name = "satou";
        private int age = 23;

        public void show() {
            System.out.println("Inner.show");
            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
        }
    }


}

