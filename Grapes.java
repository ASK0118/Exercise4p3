package CorrectionE4p2;

public class Grapes extends Fruit {
	private int kJoules;
	private int amount;
	private String nutrition;
	private String place;
	
	public Grapes(String name, int kJ, int a, String n,String p) {  //Constructor with 3 arguments
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		this.nutrition = n;
		this.place = p;
		
		 getResource(kJ);
		 getResource(kJ, a);
		 getResource();
	 
	}

	public void getResource() {   //overloading method with no parameter
		System.out.println("Origin of "+ name + "              : "+ this.place);
	}
	
	public void getResource(int kJ) {   //overloading method with 1 parameter
		System.out.println("Food energy of 100 gram " + name + ": " + kJ + " kilojoules");
	}
	
	public void getResource(int kJ, int a) {   //overloading method with 2 parameters
		System.out.println("Food energy of " + a + " gram " + name + ": " + (kJ*a/100) + " kilojoules");
	}
	
	public String toString() {   //overriding method
		return "Color of "+ name + "               : Red, Black and Purple" ; 
	}
}

