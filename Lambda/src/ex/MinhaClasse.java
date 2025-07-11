package ex;

import java.util.ArrayList;
import java.util.List;

import exx.Product;
import exxx.ProductService;

public class MinhaClasse {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Fone", 80.00));
		
		ProductService ps = new ProductService();
		double sum = ps.filtroSum(list, p -> p.getName().charAt(0)== 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
