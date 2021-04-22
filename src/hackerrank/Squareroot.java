package hackerrank;

public class Squareroot {
	
	 double num;
	
	public  Squareroot(double num) {
		this.num=num;
		int sqt=(int) Math.sqrt(num);
		System.out.println("The squre root is " +sqt);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Squareroot sqt=new Squareroot(315);
	}

}
