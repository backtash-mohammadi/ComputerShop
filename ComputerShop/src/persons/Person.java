package persons;

public class Person {

    /*TODO: TASK
    Create a Person class in a new package persons
    It should have the following private fields:
        name ( String)
        age ( int)
        address ( String)
        Create for each field a getter and setter, do not create a constructor for that class
        Add also a method introduce() which prints out a message on how the person introduces himself
        Create a second class PersonTest (also in persons) with a main method and create an instance of that person:
        Person person = new Person();
        person.setName("Alex");
        person.setAge(12);
        person.setAddress("Floor Street 12");
        // Output on Terminal: Hello! I'm Alex, 12 years old and live in 'Floor Street 12'
     */

    private String name;
    private int age;
    private String address;

    // region setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    // endregion


    // introduce method
    public void introduce() {
        System.out.println("Hey! I am " + this.name + ", I'm " + this.age + " years old and live in '" + this.address + "'");
    }


}
