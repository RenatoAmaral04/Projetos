package entities;

public class SaveConta extends Conta {
	
	private Double interestRate;
	
	public SaveConta() {
		super();
	}

	public SaveConta(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		
		balance += balance * interestRate;
	}
	
	@Override
	public void saque (double saque1) {
	
		balance -= saque1;
	}
	
}
