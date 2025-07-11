package entities;

public class Conta_Emp extends Conta { //extends chama tudo da classe conta

	private Double emprestimoLimite;
	
	public  Conta_Emp() {
		super ();
	}

	public Conta_Emp(Integer number, String holder, Double balance, Double emprestimoLimite) {
		super(number, holder, balance);
		this.emprestimoLimite = emprestimoLimite;
	}

	public Double getSaqueLimite() {
		return emprestimoLimite;
	}

	public void setSaqueLimite(Double emprestimoLimite) {
		this.emprestimoLimite = emprestimoLimite;
	}
	
	public void emprestimo(double saque1) {
		
		if(saque1 <= emprestimoLimite) {
			
			balance += saque1 - 10;
		}
	}
	
	@Override
	public void saque(double saque1) {
		
		super.saque(saque1); // ele ta puxando o saque da contacorrente normal,
		//ou seja, vai seguir aquele padrão + o padrao da emp, ou seja, vai descontar 7 reais not total
		balance -= 2.0;
	}
}
