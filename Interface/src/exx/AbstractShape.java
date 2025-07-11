package exx;

import exx.shape;

import exxx.Color;

public abstract class AbstractShape implements shape { // para implementar o shape, sem ser obrigatório o uso do double area, coloca o abstract

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
