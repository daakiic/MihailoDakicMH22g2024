package geometry;

// interfejs Comparable<tip> se koristi za sortiranje (sort) i dosutpna je (ne treba je praviti)
public abstract class Shape implements Moveable, Comparable<Shape>{

	protected boolean selected;

	public Shape() {

	}

	public Shape(boolean selected) {
		this.selected = selected;
	}

	public abstract boolean contains(int x, int y);
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
