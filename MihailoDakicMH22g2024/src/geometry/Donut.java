package geometry;

public class Donut extends Circle {

	private int innerRadius;
	private boolean selected;

	public Donut() {

	}

	public Donut(Point center, int radius, int innerRadius) {
//		this.center = center;
//		this.radius = radius;
//		kontruktor nadklase
		super(radius, center);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.selected = selected;
	}

	@Override
	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	@Override
	public boolean contains(int x, int y) {
		Point click = new Point();
		return super.contains(x, y) && center.distance(click) >= innerRadius;
	}

	@Override
	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}

	@Override
	public String toString() {
		return super.toString() + ", innerRadius: " + innerRadius;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Donut) {
			Donut temp = (Donut) o;
			if (radius == temp.getRadius() && innerRadius == temp.getInnerRadius()) {
				return true;
			}
		}
		return false;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
