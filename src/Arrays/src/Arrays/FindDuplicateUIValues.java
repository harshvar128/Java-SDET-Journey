//2. Find Duplicate Values in UI Data
//Problem
//
//During automation testing, Selenium extracts values from a webpage and stores them in an array.
//
//Due to a UI defect, some values may appear more than once.
//
//Given an array of UI values, identify all values that appear more than once.
//
//Each duplicate value should be printed only once.
//
//Class Name
//FindDuplicateUIValues
//Example 1
//
//Input:
//
//values = ["Login", "Logout", "Dashboard", "Login", "Profile"]
//
//Output:
//
//Login
//
//Explanation:
//
//"Login" appears twice.
//
//Example 2
//
//Input:
//
//values = ["Chrome", "Firefox", "Chrome", "Edge", "Firefox", "Safari"]
//
//Output:
//
//Chrome
//Firefox
//Example 3 — Multiple Duplicates
//
//Input:
//
//values = ["Admin", "User", "Admin", "Guest", "User", "Admin"]
//
//Output:
//
//Admin
//User
//
//Important:
//
//Even though "Admin" appears three times, it should be printed only once.
//
//Example 4 — No Duplicates
//
//Input:
//
//values = ["Login", "Logout", "Profile", "Dashboard"]
//
//Output:
//
//No duplicate values
//Constraints
//1 <= values.length <= 10,000
//Values are case-sensitive.
//Empty strings are allowed.
//Duplicate values must be printed only once.
//First solve without using HashSet.
//Try to solve using nested loops.
//Selenium Connection
//
//Imagine Selenium retrieves:
//
//["Admin", "User", "Admin", "Guest", "User"]
//
//from a table:
//
//List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
//
//Your program could detect duplicate records in the UI.
//
//Difficulty
//
//Medium
//
//Concepts Practiced
//Nested loops
//Array comparison
//String.equals()
//Duplicate detection
//Boolean flags
//UI data validation
package Arrays;

public class FindDuplicateUIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = {"Admin", "User", "Admin", "Guest", "User", "Admin"};
		
		for(int i=0;i<values.length;i++) {
			int count =0;
			for(int j=0;j<values.length;j++) {
				
				if(values[i].equals(values[j])) {
					count++;
					
				}
			}
				if(count>1) {
					boolean alreadyThere=false;
					
					for(int k=0;k<i;k++) {
						if(values[i].equals(values[k])){
							alreadyThere=true;
							break;
						}
					}
					if(!alreadyThere) {
					System.out.println(values[i]);
					}
					
				}
			}
		}

	}


