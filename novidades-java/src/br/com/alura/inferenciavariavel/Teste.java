package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		/*
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "123456");
		System.out.println(cpfPorNomes);
		*/
		
		// Novidade do Java 9 - Infer�ncia de vari�veis
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "123456");
		System.out.println(cpfPorNomes);

	}
}
