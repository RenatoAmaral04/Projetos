package entities;

public class OutsourcedEmployee extends Employee {

	private Double addCharge;

	public OutsourcedEmployee() {

		super();
	}

	public OutsourcedEmployee(String name, Integer horas, Double valorHora, Double addCharge) {
		super(name, horas, valorHora);
		this.addCharge = addCharge;
	}

	@Override
	public double payment() {

		return super.payment() + addCharge * 1.1;

	}
}
