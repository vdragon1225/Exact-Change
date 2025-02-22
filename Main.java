import java.util.Scanner; // import Scanner

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Declare Scanner

        // Declare variable to hold user change and prompt user for input
        System.out.print("Enter change amount: ");
		int userChange = scan.nextInt();
		
        // Check if userChange is 0 or negative
		if (userChange <= 0) {
		    System.out.println("No change");
		    return;
		}
		
        // Create integer array to hold coin type values
		int[] denominations = {100, 25, 10, 5, 1};

        // Create string array to hold singular names of coin types
		String[] singularNames = {"Dollar", "Quarter", "Dime", "Nickel", "Penny"};

        // Create string array to hold plural names of coin types
		String[] pluralNames = {"Dollars", "Quarters", "Dimes", "Nickels", "Pennies"};
		
        // Use a for loop to iterate through denomiations array
		for (int i = 0; i < denominations.length; i++) {
            // Create an integer variable name "count" to hold amount of coin type found in userChange
		    int count = userChange / denominations[i];
		    
            // Output if the amount of coin type is greater than 0
		    if (count > 0) {
                // Print coin type naming depending on if the amount of coin type is greater than 1
		        System.out.println(count + " " + (count > 1 ? pluralNames[i] : singularNames[i]));

                // Get remainder of change
		        userChange %= denominations[i];
		    }
		}

        // Close Scanner
        scan.close();
	}
}
