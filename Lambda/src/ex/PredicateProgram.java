package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exxx.ProdutoPred;
import exx.Product;

public class PredicateProgram {

	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 120.00));
		list.add(new Product("Tablet", 45.00));
		list.add(new Product("Fone", 80.00));
		
		list.removeIf( p -> p.getValor() >= 100);
		//list.removeIf(Product::staticPred1); //não estático
		//	list.removeIf(Product::staticPred); // estático
		
		for (Product p : list) {
			
			System.out.println(p);
		}

	}

}
