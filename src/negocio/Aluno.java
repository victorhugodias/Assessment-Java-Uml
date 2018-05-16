package negocio;

import java.util.List;

public class Aluno extends Pessoa {

	
	private List<Curso> cursos;
	
	
	public Aluno(String nome, String cpf, String matricula){
		super(nome,cpf,matricula);
	}
	
	
	public Aluno(String nome, String cpf, String matricula,List<Curso> cursos){
		this(nome,cpf,matricula);
		this.setCursos(cursos);
	}


	public  String toString(){
    	String result = super.toString();
    	if(this.getCursos() != null){
        	for(Curso c : this.getCursos()){
        		result += c.toString();
        		};
        	}else{
        		result += "Não está cadastrado em nenhum curso. \n";
        	}
        	
        	return result;
    }
    
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
}
