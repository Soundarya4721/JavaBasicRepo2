package hackerrank;

public class MaxArray {
	
	public static void maxArra(int a[]) {
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int maxArra[]= {1,6,7,9,10,12};
		maxArra(maxArra);
		
	}

}
