package ex;

import exx.AbstractShape;
import exx.Retangulo;
import exxx.Color;
import exx.Circulo;

public class Interface2 {

	public static void main(String[] args) {
	
		AbstractShape s1 = new Circulo(Color.BLACK, 2.0);
		AbstractShape s2 = new Retangulo(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}

}
