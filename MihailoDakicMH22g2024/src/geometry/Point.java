package geometry;

public class Point extends Shape {

	private int x;
	private int y;

//	implicitno, podrazumevani konstruktor
//	ukoliko ne postoje drugi konstruktori, ne mora eksplicitno da se navodi
	public Point() {

	}

//	u javi je moguce imati vise metoda koje iaju identican naziv ali 
//	samo pod uslovom da imaju razlicitu kombinaciju parametara
//	ova pojava se naziva - overloading
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
//		primer nasledjivanja konstruktora
		this(x, y);
		this.selected = selected;
	}

	public double distance(Point p) {
		int dx = x - p.getX(); // moze i this.x
		int dy = y - p.getY(); // moze i this.y
		return Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		x += byX;
		y += byY;
	}

	@Override
	public boolean contains(int x, int y) {
		return distance(new Point(x, y)) <= 2;
	}

	@Override
	public String toString() {
//		String.format("(%s, %s)", x, y);
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int compareTo(Shape o) {
		if (o instanceof Point) {
			Point temp = (Point) o; // kastovanje
			return (int)(distance(new Point(0, 0)) - temp.distance(new Point(0, 0)));
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Point) {
//			this.x == o.getx
			Point temp = (Point) o;
			if (this.x == temp.getX() && this.y == temp.getY())
				return true;
		}
		return false;
	}

//	get metode - vracaju nam isti tip podatka kao i sam atribut
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

// 	set metode - u okviru ove metode x se odnosi iskljucivo na parametre a ne na argumente
	public void setX(int x) {
		this.x = x; // this - referenca na objekat koji poziva ovu metodu
	}

	public void setY(int y) {
		this.y = y;
	}

}
