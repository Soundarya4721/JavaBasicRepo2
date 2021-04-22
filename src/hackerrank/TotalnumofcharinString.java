package hackerrank;

public class TotalnumofcharinString {

	public static void main(String[] args) {

		String s="The world is so big";
		int count=0;
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
