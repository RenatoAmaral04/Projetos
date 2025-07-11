package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import exx.Product;
import exxx.ProdutoFunc;

public class FunctionProgram {
	

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 120.00));
		list.add(new Product("Tablet", 45.00));
		list.add(new Product("Fone", 80.00));
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List <String> names = list.stream().map(new ProdutoFunc()).collect(Collectors.toList());
		//List <String> names = list.stream().map(Product::staticFunc).collect(Collectors.toList());
		//List <String> names = list.stream().map(Product::staticFunc1).collect(Collectors.toList());
		//List <String> names = list.stream().map(func).collect(Collectors.toList());
		List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
