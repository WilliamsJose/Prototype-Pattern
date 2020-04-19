package abstracts;

public abstract class Shape {
	private String id;
	private String type;
	
	public Shape(){}
	
	public Shape(Shape shape) {
		if(!shape.equals(null)) {
			this.id = shape.id;
			this.type = shape.type;
		}
	}
	
	public abstract Shape clone();
	public abstract String showInfo();
	
	public String getId() {
		return this.id;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
