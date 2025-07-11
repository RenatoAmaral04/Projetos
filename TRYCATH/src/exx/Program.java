package exx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exxx.Reservation;
import exxx.exception.DomainException;

public class Program {

	public static void main(String[] args){ 
		
		//throws ParseException 
		// to no método main, quando tiver exceção o main não precisa
		// tratar, por isso que quem trata é o throws e o nome da exceção que ele
		// vaitratar
		
		Scanner ff = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
					System.out.print("Room number: ");
					int number = ff.nextInt();
					System.out.print("Data do check-in (dd/MM/yyyy): ");
					Date checkIn = sdf.parse(ff.next());
					System.out.print("Data do check-out (dd/MM/yyyy): ");
					Date checkOut = sdf.parse(ff.next());
			
					Reservation reserva = new Reservation(number, checkIn, checkOut);
					System.out.println("RESERVA FEITA: " + reserva);
					System.out.println();
			
					System.out.println("Digite as datas atualizadas");
					System.out.print("Data do check-in (dd/MM/yyyy): ");
					checkIn = sdf.parse(ff.next());
					System.out.print("Data do check-out (dd/MM/yyyy): ");
					checkOut = sdf.parse(ff.next());
			
					reserva.updateDates(checkIn, checkOut);
					System.out.println("RESERVA atualizada: " + reserva);			
			}
			catch(ParseException e) {
				System.out.println("Data Invalida");
			}	
			catch(DomainException e) {
				
				System.out.println("Error na reserva: " + e.getMessage());
			}
			catch(RuntimeException e) { //qualquer tipo de exceção, para o código não quebrar
				
				System.out.println("Erro inesperado");
			}
				ff.close();
	}
}
