package CorrectionE4p2;

public class Orange extends Fruit {
	private int calories;
	private double weight;
	private String taste;
	
	public Orange(String name, double w, String t, int cal, String B) {  //Constructor with 3 arguments 
		
		super(name);
		this.calories = cal;
		this.weight = w;
		this.taste = t;
		
		getInfo();
		getInfo(B);
		getInfo(cal, w);
	}
	
	public void getInfo() { //overloading method with no parameter
		System.out.println("The taste of orange                 : " + this.taste);
	}
	
	public void getInfo(String benefict) {  //overloading method with 1 parameter
		System.out.println("The benefict of consuming the orange: " + benefict);
	}
	public void getInfo(int cal, double w){  //overloading method with 2 parameters
		System.out.println("Calories of " + name + " in " + this.weight + " gram     : " + cal * w);	 
	}
	
	public String toString() { //overriding method
		return "Percantage of calories intake for a normal human if "+ this.weight + " gram of " + this.name + " consume: "+ this.calories*this.weight/2500*100 + " %";
	}
	
}
