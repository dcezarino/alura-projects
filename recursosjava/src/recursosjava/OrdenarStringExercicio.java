package recursosjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarStringExercicio {
	public static void main(String[] args) {

		List<String> palavaras = new ArrayList<String>();
		palavaras.add("Alura online");
		palavaras.add("Editora casa do código");
		palavaras.add("Caelum");

		// First solution
		palavaras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// Second solution
		palavaras.sort(Comparator.comparing(s -> s.length()));

		// Third solution (reference)
		palavaras.sort(Comparator.comparing(String::length));
		
		palavaras.sort(String.CASE_INSENSITIVE_ORDER);

		palavaras.forEach(System.out::println);

	}
}
