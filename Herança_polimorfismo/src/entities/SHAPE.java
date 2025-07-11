package entities;
import entities1.ENUM;

public abstract class SHAPE {
	
	private ENUM color;
	
	public SHAPE() {
		
	}

	public SHAPE(ENUM color) {
		
		this.color = color;
		
	}
	
	public ENUM getColor() {
		return color;
	}

	public void setColor(ENUM color) {
		this.color = color;
	}
	
	public abstract double area();
}
