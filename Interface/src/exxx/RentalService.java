package exxx;

import java.time.Duration;

import exx.Fatura;
import exx.TempoCar;

public class RentalService {

	private Double priceHour;
	private Double priceDay;

	private TaxService taxservice;

	public RentalService(Double priceHour, Double priceDay, TaxService taxservice) {

		this.priceHour = priceHour;
		this.priceDay = priceDay;
		this.taxservice = taxservice;
	}

	public void processFatura(TempoCar TempoCar) {

		TempoCar.setFatura(new Fatura(50.0, 10.0));
		double minutes = Duration.between(TempoCar.getStart(), TempoCar.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			
			basicPayment = priceHour * Math.ceil(hours);
		}
		else {
			
			basicPayment = priceDay * Math.ceil(hours/24.0);
		}
		
		double tax = taxservice.tax(basicPayment);
		TempoCar.setFatura(new Fatura(basicPayment, tax));
	}

}
