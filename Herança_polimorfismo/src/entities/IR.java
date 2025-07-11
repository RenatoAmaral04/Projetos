package entities;

public abstract class IR {
	
		private String name;
		private Double renda;
		
		public IR() {
			
		}
		public IR(String name, Double renda) {
			this.name = name;
			this.renda = renda;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getRenda() {
			return renda;
		}

		public void setRenda(Double renda) {
			this.renda = renda;
		}
		
		public abstract double tax();
}