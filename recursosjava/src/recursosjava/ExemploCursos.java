package recursosjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Lambda
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		
		// Method reference
		cursos.sort(Comparator.comparing(Curso::getAlunos));
				
		// Example 01
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome()));
		
		// Example 02 (Method reference)
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.map(Curso::getAlunos)
			.forEach(System.out::println);	
		
		// Find first element
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		OptionalDouble optionalAverage = cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
		
		optionalAverage.stream()
			.forEach(System.out::println);		

		List<Curso> listCursos = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		
		listCursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
		
	}

}
