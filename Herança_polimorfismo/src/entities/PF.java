package entities;

public class PF extends IR {

	private Double saude;

	public PF(String name, Double renda, Double saude) {
		super(name, renda);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}


	@Override
	public double tax() {
		// TODO Auto-generated method stub
		double pf = 0;
		if (getRenda() > 20000 ) {
		
			pf = (getRenda()*0.25)  - (saude * 0.5); ;
		}else {
			
			pf = getRenda() * 0.15 - (saude *0.5);
		}
		return pf;
	}
	
	public String exTax() {
		
		return getName() + " $ " + String.format("%.2f",tax());
	}
}
