package negocio;

public abstract class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
    private String cpf;
    private String matricula;
    
    
    public Pessoa(String nome,String cpf,String matricula){
    	this.setNome(nome);
    	this.setCpf(cpf);
    	this.setMatricula(matricula);
    }
    
    
    
    @Override
    public  String toString(){
    	String result = "Nome: " + getNome() +"\n" +
    					"CPF: " + getCpf() +"\n" +
    					"Matrícula: " + getMatricula() +"\n";
    	
    	return result;
    }
    
    
    public int compareTo(Pessoa p){
    	return this.getNome().compareToIgnoreCase(p.getNome());
    }
    
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
    
}
