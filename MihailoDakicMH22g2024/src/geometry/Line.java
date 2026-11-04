package geometry;

public class Line {
	
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
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
	
	public double lenght() {
		return startPoint.distance(endPoint);
	}
	
	@Override 
	public String toString() {
		return String.format("(%s, %s) --> (%s, %s)",
				startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());

	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	
}
