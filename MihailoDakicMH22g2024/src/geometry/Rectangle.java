package geometry;

public class Rectangle {
	
	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {
	
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this (upperLeft, width, height);
		this.selected = selected;
	}	
	
	public int area() {
		return height*width;
	}
	
	public int circumference() {
		return 2*height + 2*width;
	}
	
	@Override 
	public String toString() {
		return String.format("(%s, %s), width = %s, height = %s",
				upperLeft.getX(), upperLeft.getY(), width, height);

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
	public boolean isSelected() {
		return selected;
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
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
		
}
