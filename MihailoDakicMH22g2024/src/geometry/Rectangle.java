package geometry;

public class Rectangle extends Shape {

	private Point upperLeft;
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}

	public int area() {
		return height * width;
	}

	public int circumference() {
		return 2 * height + 2 * width;
	}

	@Override
	public void moveTo(int x, int y) {
		upperLeft.moveTo(x, y);
	}

	@Override
	public void moveBy(int byX, int byY) {
		upperLeft.moveBy(byX, byY);
	}

	@Override
	public boolean contains(int x, int y) {
		return (x >= upperLeft.getX() && x <= upperLeft.getX() + width)
				&& (x >= upperLeft.getY() && x <= upperLeft.getY() + width);
	}

	// overloading
	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}

	@Override
	public String toString() {
		return String.format("(%s, %s), width = %s, height = %s", upperLeft.getX(), upperLeft.getY(), width, height);

	}
	
	@Override
	public int compareTo(Shape o) {
		if (o instanceof Rectangle) {
			Rectangle temp = (Rectangle) o;
			return (int) (area() - temp.area());
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			Rectangle temp = (Rectangle) o;
			if (this.width == temp.getWidth() && this.height == temp.getHeight()) {
				return true;
			}
		}
		return false;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
