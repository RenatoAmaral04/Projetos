package ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exx.TempoCar;
import exx.Veiculo;
import exxx.BrazilTax;
import exxx.RentalService;

public class Interface {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre com os dados do aluguel");
		
		System.out.print("Modelo do carro: ");
		String model = ff.nextLine();
		System.out.println("Retirada (dd/MM/yyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(ff.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(ff.nextLine(), fmt);
		
		TempoCar vr = new TempoCar(start, finish, new Veiculo(model));
		
		System.out.println("pRECO POR HORA: ");
		double precoHour = ff.nextDouble();
		System.out.println("pRECO POR DIA: ");
		double precoDay = ff.nextDouble();
		
		RentalService rentalservice = new RentalService(precoHour, precoDay, new BrazilTax());
		rentalservice.processFatura(vr);
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + vr.getFatura().getBasicPayment());
		System.out.println("Imposto: " + vr.getFatura().getTax());
		System.out.println("Pgamento total: " + vr.getFatura().getTotalPayment());
		
		ff.close();
	}

}
