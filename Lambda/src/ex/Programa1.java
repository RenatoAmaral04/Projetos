package ex;

import java.util.ArrayList;
import java.util.List;

import exx.Product;

public class Programa1 {
	
	public static int compareProducts(Product p1,  Product p2) {
		
		return p1.getValor().compareTo(p2.getValor());
	}

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 120.00));
		list.add(new Product("Tablet", 45.00));
		list.add(new Product("Fone", 80.00));

		//list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		list.sort(Programa1::compareProducts);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
