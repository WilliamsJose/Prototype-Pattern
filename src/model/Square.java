package model;

import abstracts.Shape;

public class Square extends Shape {
	private String type;
	
	public Square() {}
	
	public Square(Square square) {
		super(square);
		if(square != null) {
			this.type = square.type;
		}
	}
	
	@Override
	public String showInfo() {
		return "id: "+this.getId()+"\nType: "+this.getType()+"\nType of this: "+this.type;
	}

	@Override
	public Shape clone() {
		return new Square(this);
	}

}
