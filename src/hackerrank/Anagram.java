package hackerrank;

import java.util.Arrays;

public class Anagram {

	/**
	 * If string has same charectrs but different order
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1="grab";
		String s2="Brag";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] char1=s1.toCharArray();
		char[] char2=s2.toCharArray();
		
		
	Arrays.sort(char1);
	System.out.println(char1);
	Arrays.sort(char2);
	System.out.println(char2);

	if(Arrays.equals(char1, char2)==true) {
		System.out.println("Anagram");
	}
	
	else {
		System.out.println("non anagram");
	}

	}

}
