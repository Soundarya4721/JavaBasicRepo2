package hackerrank;

abstract class Employee{
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract String getGrade();
     private void label(){
         System.out.println("Employee's data:\n");
     }
}

class Engineer extends Employee{
	
	private int salary;
    private String grade;

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
class Manager extends Employee{

	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return null;
	}
    
}