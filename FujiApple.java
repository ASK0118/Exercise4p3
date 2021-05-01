package CorrectionE4p2;

public class FujiApple extends Apple{
	
	private double yen;
		
		public FujiApple(String name, int q, int p, String place, double yen) {   //Constructor with 4 arguments
			
			super(name, q, p, place);
			this.yen = yen;
			
			total1(q,p);
		}
		
		public void total1(int q, int p) { //overloading method with 2 parameters
			System.out.println("Total price of " + q + " apples (japanese yen)      : " + (q * p * yen) + " yen" );
		}
		
		public String total1() {  //overloading method with no parameter
			return "Total calories of " + quantity + " gram " + name + "         : " + quantity*52 ;
		}
		
		public String toString() {   //overriding method
			return "Color of "+ name + "                         : Lovely pink" ;
		}
		
		public String getPlace() {   //overriding method
			return "Origin of " + name + "                        : " + this.place;
		}
}
