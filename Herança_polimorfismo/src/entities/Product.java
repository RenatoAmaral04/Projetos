package entities;

public class Product {

	private String name;
	private Double preco;
	
	public Product(){
		
	}

	public Product(String name, Double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double totalPrice() {
		// TODO Auto-generated method stub
		return preco;
	}
	
	public String toString() {
		
		return  getName() + " $ " + String.format("%.2f", preco);
	}
}
