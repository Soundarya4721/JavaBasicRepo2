package hackerrank;

public class Palindrome {
	
	
	public static String check_palindrome(int input) {
		int temp;
		int revnumber=0;
		String result;
		temp=input;
		if(input<0) {
			System.out.println("please enter a positive value");
			System.exit(1);
		}
		else if(input>=0 && input<=9) {
			System.out.println("Please enter a value which is more than 10");
			System.exit(1);
		}
		
		else {
			while(input>0) {
				revnumber=(revnumber*10)+(input%10);
				input=input/10;
			}
		}
		
		System.out.println("Input " +temp);
		System.out.println("Reversed " +revnumber);
		if(temp==revnumber) {
			result="Palindrome";
			System.out.println(result);
		}
		
		else {
			result="Not palindrome";
			System.out.println(result);
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_palindrome(1);
		
}
}