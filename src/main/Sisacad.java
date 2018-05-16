package main;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.SalarioInvalido;
import negocio.Administrativo;
import negocio.Aluno;
import negocio.Curso;
import negocio.Pessoa;
import negocio.Professor;

public class Sisacad {
	static Scanner entrada = new Scanner(System.in);
	
	static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	static List<Curso> cursos = new ArrayList<Curso>();
	
	private static void preencherCursos(){
		cursos.add(new Curso("Java EE", 40));
		cursos.add(new Curso("Android Iniciante", 20));
		cursos.add(new Curso(".Net", 60));
		cursos.add(new Curso("Projeto de Bloco", 120));
	}
	
	private static void preencherPessoas(){
		pessoas.add(new Aluno("Victor Dias","173.272.877-10","01",cursos));
		pessoas.add(new Professor("Rodrigo Filomeno","123.456.789-10","02",cursos));
		pessoas.add(new Professor("LP","123.456.789-10","05",cursos));
		
		try{
		pessoas.add(new Administrativo("Munir Xavier","789.456.132-10","03",4000));
		}catch(SalarioInvalido e){
			System.out.println(e.getMessage());
		}
		
		pessoas.add(new Aluno("Gabriel Ramos","456.897.213-10","04",cursos));
	}
	

	public static void main(String[] args) {		
		preencherCursos();
		preencherPessoas();
		
		
		int opcao;
		  do {
			  System.out.println("1 - Consultar");
			  System.out.println("0 - Fechar Sistema");
			  System.out.println("Opcao: ");
			  opcao = entrada.nextInt();
			  entrada.nextLine();
		   	switch(opcao){
		   		case 1:
				System.out.println("Digite a matricula: ");	 
				String matricula = entrada.nextLine();
				Pessoa p = null;
				  for (Pessoa pessoa : pessoas) {
					  if (matricula.equals(pessoa.getMatricula())) {
						   p = pessoa;
				  }
				 }
				if (p != null) {
					System.out.println(p.toString());
				}else{
					System.out.println("pessoa não encontrada");  
				  }
				break;
		   		case 0:   
		   		break;
		   		default:
		   			System.out.println("Opção inválida.");
		   	}
		  		} while(opcao != 0);
		}
	}

