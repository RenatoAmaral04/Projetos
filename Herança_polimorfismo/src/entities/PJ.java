package entities;

public class PJ extends IR {

	private int func;

	public PJ(String name, Double renda, int func) {
		super(name, renda);
		this.func = func;
	}

	public int getFunc() {
		return func;
	}

	public void setFunc(int func) {
		this.func = func;
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		double func1 = 0;
		if(func > 10) {
					
			func1 = getRenda() *0.14;
		}else {
			
			func1 = getRenda() * 0.16;
		}
		return func1;
	}
	public String exTax() {
		
		return getName() + " $ " + String.format("%.2f",tax());
	}
}
