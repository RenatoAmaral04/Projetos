package exx;

import exx.shape;
import exxx.Color;

public class Retangulo extends AbstractShape {


		private Double width;
		private Double height;
		
		public Retangulo(Color color, Double width, Double height) {
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
