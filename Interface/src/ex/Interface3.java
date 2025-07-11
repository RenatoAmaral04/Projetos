package ex;

import java.util.Locale;
import java.util.Scanner;

import exx.BrazilInterestService;
import exx.UsaInterestService;
import exxx.InterestService;

public class Interface3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		InterestService iss = new UsaInterestService(1.0);
		double payment1 = iss.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		System.out.println(String.format("%.2f", payment1));
		
		sc.close();
	}

}
