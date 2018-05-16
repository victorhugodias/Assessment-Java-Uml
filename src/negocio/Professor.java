package negocio;

import java.util.List;

public class Professor extends Pessoa {

	
	private double salario;
	private List<Curso> cursos;
	
	
	public Professor(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
		this.setSalario(0);
	}
	
	public Professor(String nome, String cpf, String matricula, List<Curso> cursos){
		this(nome, cpf, matricula);
		this.setCursos(cursos);
		this.setSalario(calculaSalario());
	}
	
	
	
	
	private double calculaSalario(){
		double valorX = 0;
		for(Curso c : cursos){
			valorX += 50*c.getQtdHoras();
		}
		return valorX;
	}
	
	
	public  String toString(){
    	String result = super.toString() +
    	"Salário: " + this.getSalario() + "\n";
    	
    	if(this.getCursos() != null){
        	for(Curso c : this.getCursos()){
        		result += c.toString();
        		};
        	}else{
        		result += "Não está cadastrado em nenhum curso. \n";
        	}
        	
        	return result;
        }
  
    
	
	
	
	
	
	

	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
