package entities;

import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter; // tem que ter esse pra formatar a data

public class UsedProduct extends Product {

	private LocalDate dataCompra;

	public UsedProduct(String name, Double preco, LocalDate dataCompra) {
		super(name, preco);
		this.dataCompra = dataCompra;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {

		return getName() + " (used) $ " + String.format("%.2f", totalPrice()) + " (Data de fabricação "
				+ dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
