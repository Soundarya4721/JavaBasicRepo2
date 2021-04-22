package assignment_Day02_Loops_Arrays;

/**
 * 
 * @author ltatavarthy
 *
 * WAP to print 10 to 1 using for, while and do-while loop
 */

public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;

		//Do-while loop
		do {
			System.out.println(i);
			i--;
			
		}
		while(i>0);
		
	
		System.out.println("--------------------");
		
		//while loop
		
		
		for(i=10;i>0;i--) {
			System.out.println(i);
		}
			

		System.out.println("--------------------");
		
		while(i>0) {
			
			System.out.println(i);
			i--;
		}
		
		
	
		
	}

}
