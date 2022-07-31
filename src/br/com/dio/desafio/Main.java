package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso01 = new Curso(1, "Curso de Java", "Melhor Curso de Java do Mundo",360);
		Curso curso02 = new Curso(2, "Curso de Spring", "Melhor Curso de Spring do Mundo", 350);
		Mentoria mentoria01 = new Mentoria(1, "Mento Java", "Melhore Mentoria", LocalDate.now());
		Mentoria mentoria02 = new Mentoria(1, "Mento Java", "Melhore Mentoria", LocalDate.now());
		
		Bootcamp bootcamp01 = new Bootcamp(1, "Bootcamp Java", "Melhor bootcamp do mundo");
		bootcamp01.getConteudos().addAll(Arrays.asList(curso01,curso02,mentoria01));
		
		Bootcamp bootcamp02 = new Bootcamp(1, "Bootcamp Java Avançado.", "Melhor bootcamp Avançado do mundo!!!");
		bootcamp02.getConteudos().addAll(Arrays.asList(curso01,curso02,mentoria01,mentoria02));
		
		Dev dev01 = new Dev(1, "Bia");
		dev01.inscrincao(bootcamp01);
		
		System.out.println(dev01.exibirCursos());
		dev01.progredir();
		System.out.println(dev01.exibirCursos());
		System.out.println(dev01.calculoTotalXP());
		dev01.progredir();
		System.out.println(dev01.exibirCursos());
		System.out.println(dev01.calculoTotalXP());
		
//		System.out.println(curso01);
//		System.out.println("XP do Curso 01 = " + curso01.calcularXP());
//		System.out.println(curso02);
//		
//		System.out.println(mentoria01);
//		System.out.println(mentoria02);
	}

}
