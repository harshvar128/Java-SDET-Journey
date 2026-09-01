//1. Search for a Specific Value in UI Data
//Problem
//
//During UI automation, Selenium retrieves text from multiple web elements and stores them in an array.
//
//You are given an array containing the names of products displayed on a webpage. Given a target product name, determine whether the product is present in the UI data.
//
//Return true if the product exists; otherwise, return false.
//
//Class Name
//SearchValueInArray
//Example 1
//
//Input:
//
//products = ["Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"]
//target = "Monitor"
//
//Output:
//
//true
//
//Explanation:
//
//"Monitor" exists in the UI product list.
//
//Example 2
//
//Input:
//
//products = ["Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"]
//target = "Printer"
//
//Output:
//
//false
//
//Explanation:
//
//"Printer" does not exist in the UI product list.
//
//Example 3 — Tricky Case
//
//Input:
//
//products = ["Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"]
//target = "monitor"
//
//Output:
//
//false
//
//Explanation:
//
//The comparison is case-sensitive. "Monitor" and "monitor" are different strings.
//
//Constraints
//1 <= products.length <= 10,000
//1 <= products[i].length <= 50
//1 <= target.length <= 50
//Product names are case-sensitive.
//Duplicate product names may exist.
//Do not use Arrays.asList().contains().
//Solve using a loop and String comparison.
//Selenium Connection
//
//In a real Selenium test, the array could come from:
//
//String[] products = driver.findElements(By.cssSelector(".product-name"))
//                          .stream()
//                          .map(WebElement::getText)
//                          .toArray(String[]::new);
//
//Your Java logic would then verify whether the expected product is actually displayed.
//
//Expected Approach
//
//Think:
//
//Array
//  ↓
//Loop through every element
//  ↓
//Compare element with target
//  ↓
//Found?
// ├── Yes → true
// └── No  → false
//Difficulty
//
//Easy → Medium

package Arrays;

import java.util.*;

public class SearchValueInArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		String[] arrProducts = new String[n];
		
		for (int i=0;i<n;i++) {
			arrProducts[i]=sc.next();
		}
		
		for (int i=0;i<n;i++) {
			System.out.println(arrProducts[i]);
		}
		
		String target=sc.next();
		
		//code
		boolean ifFound =false;
		for(int i=0;i<n;i++) {
			
			if (arrProducts[i].equals(target)) {
				System.out.println(arrProducts[i]+ " is at-> " +(i+1) );
				ifFound=true;
				
			}
			
		}
		if(ifFound==false) {
			System.out.println("Cannot find it");}
	}

}
