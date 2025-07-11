package exxx;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();

	default double payment(double amount, int months) { 
		//não vou precisar ficar colocando essa operação em vários lugares,
		//deixa na interface que elafaz, depois só chamar no meu programa principal
		
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
