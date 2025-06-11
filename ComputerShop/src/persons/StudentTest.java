package persons;

public class StudentTest extends PersonTest{

    public static void main (String[] args){

        // Student
        Student max = new Student("I like numbers in Java - aren't they int-eresting?!");
        max.setName("Max"); max.setAge(17); max.setAddress("Wall street 22");
        max.introduce();
        max.tellJoke();

    }
}
