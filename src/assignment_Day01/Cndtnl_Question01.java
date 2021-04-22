package assignment_Day01;
/**
 * 
 * @author ltatavarthy
 * 
 * 1. Take three numbers from the user and print the greatest number. 

Test Data
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Expected Output :
The greatest: 87
 *
 */

public class Cndtnl_Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		int a=25;
		int b=78;
		int c=87;
		if(a>=b&&a>=c) {
			System.out.println("The greatest"+ " : "+ +a);
		}
		
		else if(b>=a&&b>=c){
			System.out.println("The greatest"+ " : "+ +b);
		}
		
		else {
			System.out.println("The greatest"+ " : "+c);
		}
	}

}
