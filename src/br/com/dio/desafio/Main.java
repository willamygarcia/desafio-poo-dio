package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Instrutor;
import br.com.dio.desafio.domain.Mentoria;
import br.com.dio.desafio.enumeration.Escolaridade;
import br.com.dio.desafio.enumeration.TipoPessoa;

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
		
		Instrutor instrutor01 = new Instrutor();
		instrutor01.setId(1);
		instrutor01.setNome("Willamy Garcia");
		instrutor01.setTipoPessoa(TipoPessoa.PESSOA_FISICA);
		instrutor01.setCpfCnpj("000.222.111-89");
		instrutor01.setEscolaridade(Escolaridade.ESPECIALISTA);
		instrutor01.getConteudosMinistrados().add(curso01);
		
		Instrutor instrutor02 = new Instrutor();
		instrutor02.setId(1);
		instrutor02.setNome("Livia Garcia");
		instrutor02.setTipoPessoa(TipoPessoa.PESSOA_FISICA);
		instrutor02.setCpfCnpj("000.222.111-11");
		instrutor02.setEscolaridade(Escolaridade.DOUTOR);
		instrutor02.getConteudosMinistrados().add(curso02);
		
		
		Dev dev01 = new Dev(1, "Bia", TipoPessoa.PESSOA_FISICA, "036.042.323-09", Escolaridade.ENSINO_SUPERIOR);
		dev01.inscricao(bootcamp01);
		bootcamp01.getDevs().add(dev01);
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------CONTROLE DE BOOTCAMP´S-----------------------------------------------");
		System.out.println("BootCamp 01");
		System.out.println(bootcamp01);
		System.out.println();
		System.out.println("BootCamp 02");
		System.out.println(bootcamp02);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------INSTRUTORES DOS BOOTCAMP´S------------------------------------------");
		System.out.println(instrutor01);
		System.out.println(instrutor02);
		
//		System.out.println(dev01.exibirCursos());
//		dev01.progredir();
//		System.out.println(dev01.exibirCursos());
//		System.out.println(dev01.calculoTotalXP());
//		dev01.progredir();
//		System.out.println(dev01.exibirCursos());
//		System.out.println(dev01.calculoTotalXP());
		
//		System.out.println(curso01);
//		System.out.println("XP do Curso 01 = " + curso01.calcularXP());
//		System.out.println(curso02);
//		
//		System.out.println(mentoria01);
//		System.out.println(mentoria02);
	}

}
