package recursosjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenarStringExercicio {
	public static void main(String[] args) {

		List<String> palavaras = new ArrayList<String>();
		palavaras.add("Alura online");
		palavaras.add("Editora casa do código");
		palavaras.add("Caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		palavaras.sort(comparador);
		System.out.println(palavaras);

		Consumer<String> consumidor = new ImprimeNaLinha();
		palavaras.forEach(consumidor);

	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
