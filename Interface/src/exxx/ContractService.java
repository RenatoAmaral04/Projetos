package exxx;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import exx.Contract;
import exx.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentServices;
	
	public ContractService( OnlinePaymentService onlinePaymentServices) {
		this.onlinePaymentServices = onlinePaymentServices;
	}

	public void processContract(Integer months, Contract contract) {
		
		double basicQuota = contract.getTotalValue()/months; //dividindo o valor  pelo total de parcelas
		
	     for (int i = 1; i <= months; i++) {
	            LocalDate dueDate = contract.getDate().plusMonths(i); // pega a data e acrescenta "i" mes
	            double interest = onlinePaymentServices.interest(basicQuota, i);//o interest recebe o valor da parcela 
	            double fee = onlinePaymentServices.paymentFee(basicQuota + interest);//recebe o valor de interest mais a taxa da de 1%
	            double quota = basicQuota + interest + fee; //pega o valor com o juros, mais a taxa fixa e soma
	            contract.getInstallments().add(new Installment(dueDate, quota)); //to acessando a lista de installments e adicionando a lista a data e o valor
	        }
	}
	
	
	
}