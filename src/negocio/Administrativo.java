package negocio;

import exception.SalarioInvalido;

public class Administrativo extends Pessoa {

	private double salario;
	
	
	public Administrativo(String nome, String cpf, String matricula,double salario) throws SalarioInvalido {
		super(nome, cpf, matricula);
		this.setSalario(salario);
	}
	
	
	
	
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario)throws SalarioInvalido {
		
		if(salario >= 0){
			this.salario = salario;
		}else{
			this.salario=0;
			throw new SalarioInvalido();
		}
		
	}


	public  String toString(){
    	String result = super.toString() +
    			"Salário: " + this.getSalario() + "\n";
    	
    	
    	return result;
    }
    


}
