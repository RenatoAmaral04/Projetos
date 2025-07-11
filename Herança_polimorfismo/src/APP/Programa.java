package APP;

import entities.Conta;
import entities.Conta_Emp;
import entities.SaveConta;

public class Programa {

	public static void main(String[] args) {
		
		Conta ff = new Conta (1001, "Alex", 0.0);
		Conta_Emp fff = new Conta_Emp(1002, "Maria", 0.0, 500.0);
		
		//          |		
		//UPCasting v
		
		Conta ff1 = fff;
		Conta ff2 = new Conta_Emp(1003,"Bob", 0.0, 200.0);
		Conta ff3 = new SaveConta(1004,"ANA", 0.0, 0.01);
		
		//DownCast
		
		Conta_Emp fff1 = (Conta_Emp)ff2; //coloca entre parenteses a referencia, pois ela não é a super
		fff1.emprestimo(100);
		
		//Conta_Emp fff2 = (Conta_Emp) ff3;
		
		// o ff3 é saveconta, porém não é uma conta (uma conta emp é uma conta, mas não é uma saveconta)
		//não vai dar erro no código, mas na execução vai acusar
		
		if(ff3 instanceof Conta_Emp) {
			
			Conta_Emp fff2 = (Conta_Emp)ff3;
			fff2.emprestimo(200.0);
			System.out.println("EMPRÉSTIMO!!");
		}
		
		if(ff3 instanceof SaveConta) {
			
			SaveConta fff2 = (SaveConta)ff3;
			fff2.updateBalance();
			System.out.println("UPDATE");
		}
	}
	

}
