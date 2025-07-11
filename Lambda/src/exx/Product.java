package exx;

public class Product {

	
	private String name;
	private Double valor;
	public Product(String name, Double valor) {
	
		this.name = name;
		this.valor = valor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public static boolean staticPred(Product p){
		
		return p.getValor() >= 100;
	}
	
	public boolean staticPred1(){
		
		return valor >= 100;
	}
	
	public static void staticCons(Product p) {
		
		p.setValor(p.getValor() * 1.1);
	}
	
	public void staticCons1() {
		
		valor = valor *1.1;
	}
	
	public static String staticFunc(Product p) {
		
		return p.getName().toUpperCase();
	}
	
	public  String staticFunc1() {
		
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return  name + ", " + String.format("%.2f", valor)  ;
	}
	
	
}
