package hackerrank;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < 3; i++) {
	            String name = sc.nextLine();
	            Parrot p = new Parrot();
	            if(name.equals("eat")){
	                p.eat();
	            }
	            if(name.equals("makeSound")){
	                p.makeSound();
	            }
	            if(name.equals("fly")){
	                p.fly();
	            }
	        
	    }
	}

}
