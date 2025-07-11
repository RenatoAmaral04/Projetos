package exx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Installment{
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	private Double amount;
	private LocalDate duedate;
	
	public Installment() {
	}
	
      public Installment(LocalDate date, Double amount) {
		
		this.duedate = date;
		this.amount = amount;
	}
	
	public LocalDate getDuedate() {
		return duedate;
	}

	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return duedate.format(fmt) + " - " + String.format("%.2f", amount);
 	}
}

