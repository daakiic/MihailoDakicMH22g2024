package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
//	get metode - vracaju nam isti tip podatka kao i sam atribut
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isSelected() {
		return selected;
	}

// 	set metode - u okviru ove metode x se odnosi iskljucivo na parametre a ne na argumente
	public void setX(int x) {
		this.x = x; // this - referenca na objekat koji poziva ovu metodu
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	
}
