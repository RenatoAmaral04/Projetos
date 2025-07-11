package ex;

import java.util.Set;
import java.util.TreeSet;

import exx.Product;

public class programa1 {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notbook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set ) {
			System.out.println(p);
			
}
	}

}
