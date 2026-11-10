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
