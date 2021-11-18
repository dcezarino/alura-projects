package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		*/
		
		// Novidade do Java 9 - Factory Method para Collection
		List<String> nomes = List.of("primeiroNome", "segundoNome");
		Set.of("terceiroNome");
		Map.of("nome", "João");
		System.out.println(nomes);
		
		Set<String> lista = Set.of("nome1");
		System.out.println(lista);	
		
	}
}
