package main;

import java.util.ArrayList;
import java.util.List;

import negocio.Curso;
import negocio.Pessoa;
import negocio.Professor;

public class Teste {

	public static void main(String[] args) {
		List <Curso> cursos = new ArrayList <Curso>();
		Curso c = new Curso("C#", 10);
		cursos.add(c);
		Pessoa p = new Professor("Rodrigo","132.465","02",cursos);
		
		System.out.println(p.toString());
	}

}
