package model;

import abstracts.Shape;

public class Rectangle extends Shape {
	private String type;
	
	public Rectangle() {}
	
	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		if(rectangle != null) {
			this.type = rectangle.getType();
		}
	}
	
	@Override
	public String showInfo() {
		return "id: "+this.getId()+"\nType: "+this.getType()+"\nType of this: "+this.type;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

}
