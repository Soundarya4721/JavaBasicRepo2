package assignment_Day01;

public class Numbertowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={ 1, 2, 3, 4, 5, 6, 7 };
		
		int n=2;
		
	//printing the array in the original order
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
		}
		
		//Rotate left
		
		for(int i=0;i<n;i++) {
			int k,first;
			first=arr[arr.length-1]; //storing the first element
		
			//loop to rotate
		for(k=arr.length-1;k>0;k--) {
			
			arr[k]=arr[k-1];
					
		}
			
		arr[k]=first;	
			
		}
	System.out.println();
		
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	
	}
	}
	


