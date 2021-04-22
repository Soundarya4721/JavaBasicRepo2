package assignment_Day02_Loops_Arrays;


/**
 * 
 * 
 * Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console
 *
 */

public class Question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names= {"sasi","sudheer","teja"};
		String [] teamname= {"RCB","CSK","MI"};
		String [] DOB= {"29-10-1993","19-12-1995","10-12-1998"};
		String [] Gender= {"Male","Male","Male"};
		int [] Strikerate= {166,165,170};
		
		
		for(int i=0;i<names.length;i++) {
			for(int j=1;j<teamname.length;j++) {
				for(int k=1;k<DOB.length;k++) {
					for(int l=1;l<Gender.length;l++) {
						for(int m=1;m<Strikerate.length;m++) {
							
							System.out.println(names.toString()+"-"+teamname.toString()+"-"+DOB.toString()+"-"+Gender.toString()+"-"+Strikerate.toString());

							
						}
					}
				}
			}
		}
	}

}
