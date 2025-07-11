package exxx;

import java.util.function.Consumer;

import exx.Product;

public class ProdutoCons implements Consumer<Product> {

	@Override
	public void accept(Product t) {
		
		t.setValor(t.getValor() * 1.1 );		
	}

}
