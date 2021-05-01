package CorrectionE4p2;

public class Main {

	public static void main(String[] args) {
		
		/*System.out.println("Info of Fruits");
		System.out.println("---------------");
		Fruit zFruit = new Fruit("Fruits");*/
		
		System.out.println("Info of Apple");
		System.out.println("--------------------");
		Apple q = new Apple("Apple", 3 , 10.5, "Central Aisa");
		System.out.println(q.toString());
		System.out.println(q.getPlace());
		
		System.out.println("\nInfo of Orange");
		System.out.println("--------------------");
		Orange wOrange = new Orange("Orange", 12.3, "Sour", 37, "Strengthen the immune system");
		System.out.println(wOrange.toString());
		
		
		System.out.println("\nInfo of Grapes");
		System.out.println("--------------------");
		Grapes xGrapes = new Grapes("Grapes", 288, 200, "Vitamin C, Vitamin K, Fiber", "Vitas");
		System.out.println(xGrapes.toString());
		
		System.out.println("\nInfo of Green Apple");
		System.out.println("--------------------");
		GreenApple ga = new GreenApple("Green Apple", 10 , 4, 0.2, "Australia");
		System.out.println(ga.toString());
		System.out.println(ga.getPlace());

		
		System.out.println("\nInfo of Fuji Apple");
		System.out.println("--------------------");
		FujiApple FA = new FujiApple("Fuji Apple", 8, 4, "Japan", 26.26);
		System.out.println(FA.total1());
		System.out.println(FA.toString());
		System.out.println(FA.getPlace());
	}

}
