package exx;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import exxx.Conta;
import exxx.exception.SaqueException;



public class ContaBancaria {

	public static void main(String[] args){
		
		Scanner ff = new Scanner(System.in);
	
		try {
			
		System.out.print("Digite o numero da conta: ");
		int number = ff.nextInt();
		System.out.print("Digite seu nome: ");
		String name = ff.nextLine();
		ff.next();
		System.out.print("Digite seu saldo inicial: ");
		double balance = ff.nextDouble();
		System.out.print("Digite seu limite de saque: ");
		double saqueLimit = ff.nextDouble();
		
		Conta conta = new Conta(number,name,balance,saqueLimit);
		System.out.println();
		System.out.print("Digite quanto pretende sacar:");
		double saque = ff.nextDouble();
		conta.saque(saque);

		System.out.println(conta.toString());		
	
		}
		catch(InputMismatchException e) {
			
			System.out.println("Digite o formato correto");
		}
		catch(SaqueException e) {
			
			System.out.println("Erro no processo de saque " + e.getMessage());
		}
		catch(RuntimeException e) { //qualquer tipo de exceção, para o código não quebrar
			
			System.out.println("Erro inesperado");
		}
			ff.close();
	}

}
