package CorrectionE4p2;

public class GreenApple extends Apple {
	private double DiscP;
	
	
	public GreenApple(String name, int q, double p, double dP, String place) {   //Constructor with 4 arguments
		super(name, q, p, place);
		this.DiscP = dP;
		
		total2(p,q);
		total2(q);
	}
	
	public void total2(int q) {  //overloading method with 1 parameters
		System.out.println("Total carbohydrates of " + quantity +" " + name + "         : " + this.quantity * 25 + "gram");
	}

	public void total2(double p, int q) {  //overloading method with 2 parameters
		System.out.println("Total price of " + quantity + " " + name + " (" + this.DiscP*100 + "% discount): RM " + ((p*q)-p*q*this.DiscP));
	}
	
	public String toString() {   //overriding method
		return "Commom variety of "+ name+ "                 : Shizuka apple, Crispin apple";
	}
	
	public String getPlace() {   //overriding method
		return "Origin of " + name + "                         : " + this.place;
	}
}