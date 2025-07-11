package entities;

import entities1.ENUM;

public class Circulo extends SHAPE {

	private Double radius;
	
	public Circulo() {
		super();
	}
	
	
	public Circulo(ENUM color, Double radius) {
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
