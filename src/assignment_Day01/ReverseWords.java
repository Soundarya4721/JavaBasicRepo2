package assignment_Day01;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="How are123 you abc";
		String[] words=s.split(" ");
		String revrese="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			
			revrese=revrese+" "+words[i];
		}
		
	System.out.println(revrese);
	}

}
