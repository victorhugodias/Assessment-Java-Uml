package exception;

public class SalarioInvalido extends IllegalArgumentException {
	
	
	public SalarioInvalido(){
		super("Proibido salário negativo.");
		
	}
}
