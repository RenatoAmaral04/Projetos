package exxx;

import exxx.exception.DomainException;
import exxx.exception.SaqueException;

public class Conta {

	private Integer number;
	private String holder;
	private Double balance;
	private Double saqueLimit;
	
	
	public Conta(Integer number, String holder, Double balance, Double saqueLimit) {
		

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.saqueLimit = saqueLimit;
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


	public Double getSaqueLimit() {
		return saqueLimit;
	}


	public void setSaqueLimit(Double saqueLimit) {
		this.saqueLimit = saqueLimit;
	}


	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
		amount += balance;
	}
	public void saque(double amount) {
		
	if (amount > saqueLimit) {
			
			throw new SaqueException( ", valor excede o limite de saque");
			
		} if(amount > balance){
			
			throw new SaqueException ("Saldo para saque indisponível");
		}
		
		 balance -= amount;
		
		
	}
	
	
	@Override
	public String toString() {
		
		return "Saldo atual: " + String.format("%.2f", balance);
	}
}
