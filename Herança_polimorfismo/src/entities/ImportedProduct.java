package entities;

public class ImportedProduct extends Product {
	
	private Double CustomFee;

	public ImportedProduct(String name, Double preco, Double customFee) {
		super(name, preco);
		CustomFee = customFee;
	}

	public Double getCustomFee() {
		return CustomFee;
	}

	public void setCustomFee(Double customFee) {
		CustomFee = customFee;
	}
	
	@Override
	public double totalPrice() {
		
		return getPreco() + CustomFee;
	}
	
	@Override
	public String toString() {
		
		return getName() + " $ " + String.format("%.2f",totalPrice()) + " Taxas: $ " + String.format("%.2f ", CustomFee);
	}
}
