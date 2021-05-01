package CorrectionE4p2;

public class Apple extends Fruit{

	protected int quantity;
	protected double price;
	protected String place;
	
	public Apple(String name, int q, double p, String place) { //Constructor with 3 arguments
		
		super(name);
		this.quantity = q;
		this.price = p;
		this.place = place;
		
		total();
		total(q);
		total(q, p);
		
	}
	
	public void total() {   //overloading method with no parameter
		System.out.println("Total weight of "+ this.quantity + " " + this.name+ " in gram        : " + this.quantity*120 );
	}
		
	public void total(int q) {	//overloading method with 1 parameter and overriding method from subclass FujiApple
		System.out.printf("Total weight of %d %s in kg          : %.3f%n", q ,name, q*0.12 );
	}
	
	public void total(int q, double p) { //overloading method with 2 parameters
		System.out.println("Total price of "+ q + " " + this.name + "                 : RM " + (q * p));
	}

	public String toString() {  //overriding method
		return "Total calories of " + this.quantity +" " + this.name + "              : " + this.quantity * 95;
	}
	
	public String getPlace() {   //overriding method
		return "Origin of " + name + "                        : " + this.place;
	}
}
