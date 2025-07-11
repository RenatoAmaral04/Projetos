package exxx;

import java.util.function.Function;

import exx.Product;

public class ProdutoFunc implements Function<Product, String> {

	@Override
	public String apply(Product t) {
		
		return t.getName().toUpperCase();
	}

}
