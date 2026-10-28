package geometry;

public class Circle {
	
	private int radius;
	private Point center;
	private boolean selected;
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public int getRadius() {
		return radius;
	}
	public Point getCenter() {
		return center;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setRadius(int raidus) {
		this.radius = raidus;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
}
