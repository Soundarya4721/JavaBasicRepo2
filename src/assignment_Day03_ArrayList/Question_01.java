package assignment_Day03_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author soundarya
 *
 *1. Write a Java program to create a new array list, 
 *add some colors (string) and print out the collection

 */

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrlst=new ArrayList<String>();
		arrlst.add("pink");
		arrlst.add("Red");
		arrlst.add("blue");
		arrlst.add("white");
		arrlst.add("yellow");
		arrlst.add("Violet");
		arrlst.add("maroon");
		arrlst.add("green");
		arrlst.add("orange");
		arrlst.add("indigo");
		arrlst.add("mezenta");
		arrlst.add("black");
		
			
		//Print the collection using for loop
		for(int i=0;i<arrlst.size();i++) {
			System.out.println(arrlst.get(i));
		}
		
		System.out.println("===================");
		
		
		//Print the collection using for each loop
		for(String str:arrlst) {
			System.out.println(str);
		}
		
		System.out.println("===================");
		
		/**
		 * 
		 * 
		 * 2. Write a Java program to insert an element into the array list at the first and last positions.
		 */
		arrlst.add(0, "baby pink");//First position
		arrlst.add(13,"navy blue");//Last Position
		
		for(String str:arrlst) {
			System.out.println(str);
		}
		
		System.out.println("===================");
		
		/**
		 * 3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		 */
		
		System.out.println(arrlst.get(7));
		
		System.out.println("===================");
		
		/**
		 * 4. Write a Java program to update specific array element by given element.
		 * 
		 * set method to update
		 */
		
		arrlst.set(1, "Baby Pink");
		arrlst.set(0, "Pink");
		for(String str:arrlst) {
			System.out.println(str);
		}
		System.out.println("===================");
		
		/**
		 * 5. Write a Java program to remove the third element from a array list. 
		 */
		
		arrlst.remove(2);
		for(String str:arrlst) {
			System.out.println(str);
		}
		
		System.out.println("===================");
		
		/**
		 * 	6. Write a Java program to search an element in a array list.
		 */
		
		if(arrlst.contains("Pink")) {
			System.out.println("Found elem");
		}
	
		else {
			System.out.println("Not found");
		}
		
		System.out.println("===================");
		
		/**
		 * 7. Write a Java program to reverse elements in a array list
		 */
		
		Collections.reverse(arrlst);
		
		for(String str:arrlst) {
			System.out.println(str);
		}
		
		System.out.println("===================");
		/**
		 * 8. Write a Java program to extract a portion of a array list.
		 */
		List<String> sublst=arrlst.subList(3, 6);
		System.out.println(sublst);
		
		System.out.println("===================");
		
		/**
		 * 9. Write a Java program of swap two elements in an array list.
		 */
		
		Collections.swap(arrlst, 0, 1);
		for(String str:arrlst) {
			System.out.println(str);
		}
		System.out.println("===================");
		
		/**
		 * 10. Write a Java program to empty an array list.
		 */
		sublst.removeAll(sublst);
		System.out.println(sublst);
		
		System.out.println("===================");
		
		/**
		 * 11. Write a Java program to trim the virtual capacity of an array list the current list size.
		 */

		
		System.out.println(arrlst);//Actual size
		
		arrlst.trimToSize();
		System.out.println(arrlst);
		
	
	/**
	 * 12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	 * 
	 * 
	 */
		System.out.println(arrlst.get(0));
		System.out.println(arrlst.get(2));


	}

}
