package exx;
import exxx.Color;

public class Circulo  extends AbstractShape{

	
private Double radius;
		
	public Circulo(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI  * radius * radius;
	}

}
