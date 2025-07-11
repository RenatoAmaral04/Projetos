package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import exx.Product;
import exxx.ProdutoCons;

public class ConsumerProgram {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 120.00));
		list.add(new Product("Tablet", 45.00));
		list.add(new Product("Fone", 80.00));
		
		//Consumer<Product> cons = p -> p.setValor(p.getValor() * 1.1);	
		
		//list.forEach(new ProdutoCons());
		//list.forEach(Product:: staticCons);
		//list.forEach(Product:: staticCons1);
		list.forEach( p -> p.setValor(p.getValor() * 1.1));
		
		
		list.forEach(System.out :: println);

	}

}
