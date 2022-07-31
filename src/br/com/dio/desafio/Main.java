package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso01 = new Curso(1, "Curso de Java", "Melhor Curso de Java do Mundo",360);
		Curso curso02 = new Curso(2, "Curso de Spring", "Melhor Curso de Spring do Mundo", 350);
		Mentoria mentoria01 = new Mentoria(1, "Mento Java", "Melhore Mentoria", LocalDate.now());
		Mentoria mentoria02 = new Mentoria(1, "Mento Java", "Melhore Mentoria", LocalDate.now());
		
		
		
		System.out.println(curso01);
		System.out.println("XP do Curso 01 = " + curso01.calcularXP(20D));
		System.out.println(curso02);
		
		System.out.println(mentoria01);
		System.out.println(mentoria02);
	}

}
