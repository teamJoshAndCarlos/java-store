package Java1;

/**
 * Created by jsr on 5/17/17.
 */
public class Person {
    private String name;
    public String getName(){
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Josh");
//        person1.setName("Josh");

        Person person2 = new Person("Ben");
//        person2.setName("Ben");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
