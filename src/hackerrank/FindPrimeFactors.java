package hackerrank;

public class FindPrimeFactors {
	
	public static void findFactors(int num) {
		
		while(num%2==0) {
			System.out.print(2 + "x");
			num=num/2;
		}
		 
		for(int i=3;i<Math.sqrt(num);i=i+2) {
			while(num%i==0) {
				System.out.print(i + "x");
				num=num/i;
				
			}
			
		}
		
		if(num>2) {
			System.out.print(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFactors(120);
		
	}

}
