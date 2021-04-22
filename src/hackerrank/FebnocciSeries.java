package hackerrank;

public class FebnocciSeries {
	
	
	public static void printFebnocci(int count) {
		int n1=0;
		int n2=1;
		int n3;
		
		
		if(count>0) {
			System.out.print(n1);
			System.out.print(" ");
			System.out.print(n2);
			System.out.print(" ");
		for(int i=2;i<count;i++) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3);
			System.out.print(" ");		
		}
		}
		else {
			System.out.println("Enter a valid range");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFebnocci(-1);
		

		
		
	}

}
