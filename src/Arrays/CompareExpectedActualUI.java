//3. Compare Expected vs Actual UI Values
//Problem
//
//During automation testing, you have a list of values that should appear on the webpage and a list of values that Selenium actually retrieved.
//
//Compare both arrays and determine whether the UI data exactly matches the expected data.
//
//The comparison should consider:
//
//Number of elements
//Order of elements
//Value of each element
//
//Return true only if all three match.
//
//Class Name
//CompareExpectedActualUI
//Example 1
//
//Expected:
//
//["Home", "Products", "Cart", "Checkout"]
//
//Actual:
//
//["Home", "Products", "Cart", "Checkout"]
//
//Output:
//
//true
//Example 2 — Different Value
//
//Expected:
//
//["Home", "Products", "Cart", "Checkout"]
//
//Actual:
//
//["Home", "Product", "Cart", "Checkout"]
//
//Output:
//
//false
//Example 3 — Different Order
//
//Expected:
//
//["Home", "Products", "Cart"]
//
//Actual:
//
//["Home", "Cart", "Products"]
//
//Output:
//
//false
//Example 4 — Different Length
//
//Expected:
//
//["Home", "Products", "Cart"]
//
//Actual:
//
//["Home", "Products", "Cart", "Checkout"]
//
//Output:
//
//false
//Constraints
//0 <= expected.length <= 10,000
//0 <= actual.length <= 10,000
//Comparison is case-sensitive.
//Order matters.
//Do not use Arrays.equals().
//Solve using arrays and loops.
//Selenium Connection
//
//This represents a very common automation assertion:
//
//Expected UI
//     ↓
//["Home", "Products", "Cart"]
//
//       VS
//
//Actual UI
//     ↓
//["Home", "Products", "Cart"]
//
//Your Java logic determines whether the page matches the expected UI.
//
//Difficulty
//
//Medium
//
//Concepts Practiced
//Array comparison
//Length comparison
//for loops
//String comparison
//Boolean logic
//Test validation/assertion thinking

package Arrays;
import java.util.*;

public class CompareExpectedActualUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] expected = {"Login","Register","Dashboard","Logout"};
		String[] actual = {"Login","Register","Dashboard","Logout"};
		Boolean isDiff = false;
		
		if(expected.length!=actual.length) {
			isDiff=true;
			return;
		}
		for(int i=0;i<expected.length;i++) {
			int j=i;
			if(!expected[i].equals(actual[j])) {
				isDiff=true;
				break;
			}
			
		}
		if(!isDiff) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
