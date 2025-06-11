package persons;

public class PersonTest {

    /* TODO: TASK
    Create a second class PersonTest (also in persons) with a main method and create an instance of that person:
        Person person = new Person();
        person.setName("Alex");
        person.setAge(12);
        person.setAddress("Floor Street 12");
        // Output on Terminal: Hello! I'm Alex, 12 years old and live in 'Floor Street 12'
     */
    public static void main(String [] args){
        Person p = new Person();
        p.setName("Alex");
        p.setAge(12);
        p.setAddress("Floor Street 12");
        p.introduce();

    }


}
