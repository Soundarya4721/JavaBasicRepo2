package assignment_Day02_Loops_Arrays;

/**
 * 
 *  Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
 * 
 * @author ltatavarthy
 *
 */

public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=15;i++) {
		
			if(i%7==0) {
				continue;
				
			}
			System.out.println(i);
		}

	}

}
