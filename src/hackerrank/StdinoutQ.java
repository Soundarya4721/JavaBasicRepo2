package hackerrank;

import java.util.Scanner;

public class StdinoutQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        double d=scan.nextDouble();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
