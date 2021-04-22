package assignment_Day01;
/**
 * 
 * @author ltatavarthy
 * 
 * 2. Write a Java program to test a number is positive or negative.

Test Data
Input number: 35 -- positive number
Input number: -11 -- negative number
 *
 */

public class Cndtnl_Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=-35;
		if(a<0) {
			System.out.println("Negative Number");
		}
		else if(a>0) {
			System.out.println("Postive Number");
		}
		
		else if(a==0) {
			System.out.println("Its a zero");
		}

		
	}

}
