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
				
		p2 = p1;
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
		
		System.out.println("POVRSINA PRAVOUGAONIKA " + r1.area());
		System.out.println("OBIM PRAVOUGAONIKA " + r1.circumference());
		
		Circle c1 = new Circle();
		
		c1.setRadius(5);
		c1.setCenter(p2);
		
		System.out.println();
		System.out.println("RADIUS KRUGA " + c1.getRadius());
		System.out.println("POVRSINA KRUGA " + c1.area());
		System.out.println("OBIM KRUGA " + c1.circumference());
		
		
	
		
		

	}
	

}
