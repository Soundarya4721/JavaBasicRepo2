package hackerrank;

public class ArrayExmpl {

	public static void min(int[]a) {
		
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}
	
	
	public static void main(String[] args) {

		int[]a=new int[5];
		a[0]=1;
		a[1]=3;
		a[2]=8;
		a[3]=7;
		a[4]=12;
		
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/

		min(a);
		
}
	
}