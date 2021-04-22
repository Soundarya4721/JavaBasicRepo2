package hackerrank;

public class FindHighestNumber {
	static  int number=0;
	
	 
	static int  finalLcm;
	
	public static int smallerNumber(int n1,int n2,int n3) {
		
		
	
		if(n2>=n3 && n1>=n3 ) {
			number=n3;
			System.out.println(number);
			
		}
		
		else if(n3>=n1 && n2>=n1) {
			number=n1;
			System.out.println(number);
		}
		
		else
		{
			number=n2;
			System.out.println(number);
		}		
		
		return number;
	}
	
	
	public static void getLcm(int num1,int num2,int num3) {

		int divisor=0;
		divisor=smallerNumber(num1,num2,num3);
		//System.out.println(finalLcm);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLcm(12, 16, 18);
		
}
}
