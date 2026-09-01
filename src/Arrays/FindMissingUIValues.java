//4. Find Missing Values from Expected vs Actual UI Data
//Problem
//
//During automation testing, you have a list of values that should be present on a webpage and a list of values that Selenium actually found.
//
//Find all values that are present in the expected list but missing from the actual UI.
//
//Class Name
//FindMissingUIValues
//Example 1
//
//Expected:
//
//["Login", "Dashboard", "Profile", "Logout"]
//
//Actual:
//
//["Login", "Dashboard", "Logout"]
//
//Output:
//
//Profile
//Example 2
//
//Expected:
//
//["Home", "Products", "Cart", "Checkout", "Profile"]
//
//Actual:
//
//["Home", "Cart", "Profile"]
//
//Output:
//
//Products
//Checkout
//Example 3 — Nothing Missing
//
//Expected:
//
//["Login", "Dashboard", "Logout"]
//
//Actual:
//
//["Login", "Dashboard", "Logout"]
//
//Output:
//
//No missing values
//Example 4 — Everything Missing
//
//Expected:
//
//["Login", "Dashboard", "Logout"]
//
//Actual:
//
//[]
//
//Output:
//
//Login
//Dashboard
//Logout
//Constraints
//0 <= expected.length <= 10,000
//0 <= actual.length <= 10,000
//Values are case-sensitive.
//Expected values may contain duplicates.
//Do not use HashSet, contains(), or Arrays.asList().
//Solve using arrays and loops.
//Selenium Connection
//
//This is essentially a UI regression check:
//
//Expected UI elements
//        ↓
//["Login", "Dashboard", "Profile", "Logout"]
//
//             VS
//
//Actual UI elements
//        ↓
//["Login", "Dashboard", "Logout"]
//
//             ↓
//
//Missing:
//"Profile"
//
//This type of logic can eventually become part of an automation framework's validation utilities.
//
//Difficulty
//
//Medium
//
//Concepts Practiced
//Nested loops
//Searching
//Array comparison
//Boolean flags
//Missing-element detection
//UI validation

package Arrays;

public class FindMissingUIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] expected = {"Login","Register","Dashboard","Logout"};
		String[] actual = {"Login","Register"};
		
		for (int i=0;i<expected.length;i++) {
			boolean isFound= false;
			for(int j=0;j<actual.length;j++) {
				if(expected[i].equals(actual[j])) {
					isFound= true;
				}
			}
			if(!isFound) {
				System.out.println(expected[i]);
			}
		}

}
}
