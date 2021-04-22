package hackerrank;

public class Parrot implements Animal,Bird {

	@Override
	public void fly() {
		
		System.out.println("Parrots can fly upto 50 miles in a day");
	}

	@Override
	public void eat() {
	System.out.println("Parrots can eat upto 100gms in a day");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Parrots make sound of screech");
		
		
	}

}
