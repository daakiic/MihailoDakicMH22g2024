package geometry;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint);
	}

	@Override
	public void moveTo(int x, int y) {
//		ostavljamo prazno
	}

	@Override
	public void moveBy(int byX, int byY) {
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
	}

	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x, y);
		return ((startPoint.distance(click) + endPoint.distance(click) - length())) <= 2;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s) --> (%s, %s)", startPoint.getX(), startPoint.getY(), endPoint.getX(),
				endPoint.getY());

	}

	@Override
	public int compareTo(Shape o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			return (int) (length() - temp.length());
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			if (this.startPoint.getX() == temp.getStartPoint().getX()
					&& this.startPoint.getY() == temp.getStartPoint().getY()
					&& this.endPoint.getX() == temp.getEndPoint().getX()
					&& this.endPoint.getY() == temp.getEndPoint().getY()) {
				return true;
			}
		}
		return false;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

}
