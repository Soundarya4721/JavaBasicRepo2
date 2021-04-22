package hackerrank;

public class VowelsConsonentsInString {

	public static void main(String[] args) {
		
		String s="This is a really simple sentence";
		char val;
		s.toLowerCase();
		int vowel = 0,consonent=0;
		for(int i=0;i<s.length();i++) {
			val=s.charAt(i);
			if(val==' ') {
				continue;
			}
			else if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u') {
				vowel++;
			}
			else {
				consonent++;
			}
		}
		System.out.println("Vowels : " +vowel);
		System.out.println("Consonents : "+consonent);
	}

}
