package hackerrank;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {3,43,2,320,143,4};
		
		int temp=0;
		int lenth=arr.length;
		
		for(int i=0;i<lenth;i++) {
			
			for(int j=1;j<(lenth-i);j++)
			{
				
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
							arr[j]=temp;
					System.out.println(arr[j]);
				}
				
				
			}
		}
		
				
		

	}

}
