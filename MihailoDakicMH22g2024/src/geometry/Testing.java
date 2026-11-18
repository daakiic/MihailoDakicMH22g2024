package geometry;

public class Testing {

	public static void main(String[] args) {
		// new znaci da se alocira neko mesto na memoriji !!!
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(200, 100);
		Point click = new Point(200, 100);

		Line l1 = new Line();
		Line l2 = new Line();
		Line l3 = new Line(new Point(200, 100), new Point(0, 0));

		Rectangle r1 = new Rectangle();
		// public Rectangle(Point upperLeft, int width, int height) {...}
		Rectangle r2 = new Rectangle(new Point(20, 20), 50, 50);

		Rectangle r4 = new Rectangle(new Point(20, 20), 50, 50);

		Circle c1 = new Circle();
		Circle c2 = new Circle(5, p3);
		Circle c3 = new Circle(30, new Point(200, 90));

		Donut d1 = new Donut(new Point(50, 50), 100, 30);

//		Object ob = new Object();
//		System.out.println("Objekti klase Object nisu instance bilo koje druge klase");
//		System.out.println(ob instanceof Rectangle);

		p1.setX(50);
		p1.setX(20);
		p2.setY(40);
		p1.setY(30);
		p1 = p2;
		p1.setX(200);
		p2.setY(100);
		p2 = new Point(200, 100);
		// imenuju se reference a prave izmene se desavaju na objektu
		l1.setStartPoint(p1);
		l1.setEndPoint(new Point());
		r1.setUpperLeft(p1);
		r1.setWidth(20);
		r1.setHeight(10);
		c1.setRadius(5);
		c1.setCenter(p2);
		l2.setStartPoint(p3);
		l2.setEndPoint(new Point());

//		toString je zaduzena za tekstualnu reprezentaciju 
//		equals je zaduzena za poredjenje referenci
//		Rectangle r3 = r2;
//		pokazuje da li se referencira na isti objekat a ne jel isti
//		System.out.println(r2.equals(r4));
//		instanceof je operator koji proverava da li je objekat instanca neke klase
//		r2 kao referenca je rectangle ali objekat na koji pokazuje je vise stvari istovremeno
//		klasa rectangle nasledjuje klasu object
//		referenca omogucava pristup metodama
//		onaj ko izvrsava metodu je zapravo objekat

	}

}
