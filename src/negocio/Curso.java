package negocio;

public class Curso {
	
	private String nome;
	private int qtdHoras;
	
	
	public Curso(String nome, int qtdHoras){
		this.setNome(nome);
		this.setQtdHoras(qtdHoras);
	}
	
	
	
	
	public  String toString(){
    	String result = "Nome: " + getNome() +"\n" +
    					"Quantidade de Horas: " + getQtdHoras() +"\n";
    	
    	return result;
    }
    
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
}
