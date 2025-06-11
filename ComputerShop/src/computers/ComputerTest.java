package computers;

public class ComputerTest {

    // Create a ComputerTest class that creates the computer object and prints its properties on the console.
    public static void main(String[] args) {
        Computer cp = new Computer(
                "Apple",4000,18,
                512,4,14,"Laptop",true,
                1500,2000

        );

        // TODO: Part II: Perform a memory upgrade and calculate profit
        /*
        Now perform a memory upgrade to your computer object by doubling the value of the RAM.
        Then, print the computer again (you can manipulate the existing computer object)
        The shop now wants to include the purchase price and selling price and calculate the profit per computer.
        Add this information to the class. (Hint: this should result in two new fields, and an additional method for the profit -
         apart from setters/getters)
         */

        /// double the RAM size
        cp.setRamSizeGB(cp.getRamSizeGB() * 2);

        System.out.println("\n===================================== The Computer Shop =============================================");
        System.out.println(cp);

        System.out.println("\nProfit: " + cp.calculateProfit()+ " €");
    }
}
