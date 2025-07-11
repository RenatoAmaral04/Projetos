package exx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		method2();
		System.out.println("End program");
		
	}
	
	public static void method2() {
		
		System.out.println("***METODOD 2 START*** ");
		Scanner ff = new Scanner(System.in);

		try {
			String[] vect = ff.nextLine().split(" ");
			int posi = ff.nextInt();
			System.out.println(vect[posi]);
		} catch (InputMismatchException e) {

			System.out.println("Voce digitou uma letra ao invés do numero");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println("Voce digitou uma posição que não existe");
		}
		
		System.out.println("***metodo 2 END*** ");
	}

}
