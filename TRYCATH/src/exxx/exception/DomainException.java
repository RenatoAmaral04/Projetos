package exxx.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg); //passa para o construtor da super classe, a mensagem fica armazenada na exceção
		
	}

	
}
