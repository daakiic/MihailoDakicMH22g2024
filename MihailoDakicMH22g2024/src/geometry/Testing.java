package geometry;

public class Testing {

	public static void main(String[] args) {
		//new znaci da se alocira neko mesto na memoriji !!!
		Point p1 = new Point();
		
		p1.setX(50);
		p1.setX(20);
		
		Point p2 = new Point();
		p2.setY(40);
		p1.setY(30);
				
		p1 = p2;
		
		p1.setX(200);
		p2.setY(100);
				
		p2 = new Point(200, 100);
		// imenuju se reference
		// prave izmene se desavaju na objektu/
	
		Line l1 = new Line();
		
		l1.setStartPoint(p1);
		l1.setEndPoint(new Point());
		
//		System.out.println(l1.getStartPoint());
//		System.out.println(l1.getEndPoint());
//		System.out.println(l1.isSelected());
//		System.out.println(l1.getStartPoint().getX());
		
		Rectangle r1 = new Rectangle();
		
		r1.setUpperLeft(p1);
		r1.setWidth(20);
		r1.setHeight(10);
		
//		System.out.println("POVRSINA PRAVOUGAONIKA " + r1.area());
//		System.out.println("OBIM PRAVOUGAONIKA " + r1.circumference());
		
		Circle c1 = new Circle();
		
		c1.setRadius(5);
		c1.setCenter(p2);
		
		System.out.println();
//		System.out.println("RADIUS KRUGA " + c1.getRadius());
//		System.out.println("POVRSINA KRUGA " + c1.area());
//		System.out.println("OBIM KRUGA " + c1.circumference());
		
//		vezbe 4
//		public Rectangle(Point upperLeft, int width, int height) {...}
		Rectangle r2 = new Rectangle(new Point(20,20), 50, 50);
//		toString je zaduzena za tekstualnu reprezentaciju 
		System.out.println(r2.toString());
		System.out.println(r2);
//		equals je zaduzena za poredjenje referenci
//		Rectangle r3 = r2;
		Rectangle r4 = new Rectangle(new Point(20,20), 50, 50);
//		pokazuje da li se referencira na isti objekat a ne jel isti
		System.out.println(r2.equals(r4));
		
		System.out.println("Da li su pravougaonici instance klase Object?");
//		instanceof je operator koji proverava da li je objekat instanca neke klase
		System.out.println(r2 instanceof Object);
//		r2 kao referenca je rectangle ali objekat na koji pokazuje je vise stvari istovremeno
//		klasa rectangle nasledjuje klasu object
//		referenca omogucava pristup metodama
//		onaj ko izvrsava metodu je zapravo objekat
		
		Object ob = new Object();
		System.out.println("Objekti klase Object nisu instance bilo koje druge klase");
		System.out.println(ob instanceof Rectangle);
		
		System.out.println("Testiranje toString metoda:");
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r2);
		
		System.out.println("Testiranje equals metode:");
		System.out.println(p1.equals(r2));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(ob));
		Line l2 = new Line();
		Point p3 = new Point(200,100);
		l2.setStartPoint(p3);
		l2.setEndPoint(new Point());
		System.out.println(l1.equals(l2));
		Circle c2 = new Circle(5, p3);
		System.out.println(c1.equals(c2));
		System.out.println(" ");
		System.out.println(r1);
		System.out.println(r2);
//		r2.setWidth(20);
//		r2.setHeight(10);
		System.out.println(r1.equals(r2));
		
		System.out.println();
		System.out.println("ispravak");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		Line l3 = new Line(new Point (200,100), new Point (0,0));
		System.out.println(l3);
		System.out.println(l3.equals(l2));
		
	}
	

}

















