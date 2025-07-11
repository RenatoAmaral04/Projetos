package entities;

public  class Conta {
	
	private Integer number;
	private String holder;
	protected Double balance; //ajuda ele a ser utilizado pela outra classe
	
	public Conta() {
	}

	public Conta(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void saque(double saque1) {
		
		balance -= saque1 + 5.0;
	}
	
public void deposito(double saque1) {
		
		balance += saque1;
	}

}
