package geometry;

public class Line {
	
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public double lenght() {
		return startPoint.distance(endPoint);
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
