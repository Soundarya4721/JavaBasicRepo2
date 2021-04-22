package assignment_Day04_Constructor;

import java.util.ArrayList;

/**
 * 
 * @author ltatavarthy
 *
 *1. Design a University class template with the following features:
 variables:
name
country
stablishedDate
List of course provided in Array List<String>

--Design the constructor of this class with different parameters and all parameters.

--Write the get method of each variable with return keyword. 
 *
 *
 *
 */


public class University {
	
	String name;
	String country;
	String EstablishedDate;
	ArrayList<String> courses=new ArrayList<String>();
	
	public University(String name,String country,String EstablishedDate,ArrayList<String> courses) {
		
		this.name=name;
		this.country=country;
		this.EstablishedDate=EstablishedDate;
		this.courses=courses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<String> JNTUKCourses=new ArrayList<String>();
		
		JNTUKCourses.add("EEE");
		JNTUKCourses.add("ECE");
		JNTUKCourses.add("CSE");
		JNTUKCourses.add("IT");
		
		University uni=new University("JNTUK","India" , "1993", JNTUKCourses);
		
		System.out.println(uni.name);
		System.out.println(uni.country);
		System.out.println(uni.EstablishedDate);
		
		for(String str : uni.courses) {
			System.out.println(str);
		}
		System.out.println(uni.courses.get(2));
		
	}

}
