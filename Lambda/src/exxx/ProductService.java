package exxx;

import java.util.List;
import java.util.function.Predicate;

import exx.Product;

public class ProductService {

	public double filtroSum(List<Product>list, Predicate<Product> comp) {
		
		double sum = 0;
		
		for(Product p : list) {
			if(comp.test(p)) {
				
				sum += p.getValor();
			}
			
		}
		return sum;
	}
}
