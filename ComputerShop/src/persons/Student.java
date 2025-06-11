package persons;

public class Student extends Person{

    /*
    Create a Student class, it should be a subclass of Person (create the class in package persons)
        We all know, students like to tell jokes, model this behavior in OOP
        You should be able to initialize a student object with a joke (hint: constructor)
        The joke is stored as a private variable
        Expose a public method tellJoke() which prints out the joke
        Once again, test the new class by extending the StudentTest class (create the class in package persons)
     */

    //  final means it cannot be changed after initialization
    private final String joke;

    // Constructor to create a new Student object and initialize its joke field.
    public Student(String joke) {
        this.joke = joke;
    }

    // Print the joke
    public void tellJoke() {
        System.out.println(joke);
    }

}
