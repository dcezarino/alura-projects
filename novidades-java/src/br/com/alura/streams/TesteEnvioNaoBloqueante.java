package br.com.alura.streams;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import br.com.alura.streams.model.NotaFiscal;
import br.com.alura.streams.wsclient.NotaFiscalWSClient;

public class TesteEnvioNaoBloqueante {

	public static void main(String[] args) {
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("Jo?o", 39.99, LocalDate.now());		
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
		publisher.consume(nfwsc::enviar);
		publisher.submit(primeiraNotaFiscal);
		System.out.println("Voc? ir? receber a nota fiscal no seu e-mail");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();	
		
	}
}
