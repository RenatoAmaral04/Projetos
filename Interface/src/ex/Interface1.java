package ex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat; 


import exx.Contract;
import exx.Installment;
import exxx.ContractService;
import exxx.OnlinePaymentService;
import exxx.PaypalService;

public class Interface1 {

	public static void main(String[] args) {
	
		
		Scanner ff = new Scanner(System.in);
		List <Installment> parcelas = new ArrayList<>();
		
		
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = ff.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(ff.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = ff.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = ff.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService()); 
		//todas as regras e contas foram feitas, 
		//porém precisam mandar para o paypalService
		
		contractService.processContract(n, obj);
		
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) { //percorrendo a lista que esta no installment e exibindo o resultado
			System.out.println(installment);
		}
		
		ff.close();
		
		
		
	
	}
}
