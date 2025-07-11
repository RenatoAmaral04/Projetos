package APP;

import entities.Conta;
import entities.Conta_Emp;
import entities.SaveConta;

public class Programa1 {

	public static void main(String[] args) {
		
		Conta C1 = new Conta(1001, "Alex", 1000.0);
		System.out.println(C1.getBalance());
		
		Conta C2 = new SaveConta(1002, "MARIA", 1000.0, 0.01);
		System.out.println(C2.getBalance());
		
		Conta C3 = new Conta_Emp(1003, "JOÃO", 1000.0, 0.01);
		System.out.println(C3.getBalance());
	}

}
