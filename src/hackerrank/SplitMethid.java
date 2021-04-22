package hackerrank;

public class SplitMethid {

	
	public static void main(String[] args) {
		String s="Welcome to Java";
		String[]words=s.split("\\s");
		
		for(String wrd:words) {
			System.out.println(wrd);
		}

	}
}
