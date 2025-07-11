package exxx;

import java.util.function.Predicate;

import exx.Product;

public class ProdutoPred implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		
		return t.getValor()>= 100;
	}

}
