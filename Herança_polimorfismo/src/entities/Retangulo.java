package entities;
import entities1.ENUM;

public class Retangulo extends SHAPE{

	private Double width;
	private Double height;
	
	
	public Retangulo() {
		super();
	}
	
	


	public Retangulo(ENUM color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}




	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
