package hackerrank;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int i=371;
		int k=0;
		
		int temp,sum=0,count=0;;
		
		temp=i;

		while(i>0) {
            k=i%10;  
            i=i/10; 
            count++;         
         k=k*k*k;
         sum=sum+k;
           
		
		}
		System.out.println(count);
		System.out.println(sum);

        if(temp==sum) {
        	System.out.println("Armstrong Number");
        }
        
	}

}
