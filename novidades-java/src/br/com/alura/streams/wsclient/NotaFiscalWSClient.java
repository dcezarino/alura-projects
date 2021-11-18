package br.com.alura.streams.wsclient;

import br.com.alura.streams.model.NotaFiscal;

public class NotaFiscalWSClient {

	public void enviar(NotaFiscal nf) {
		try {
			System.out.println("Emitindo nota fiscal");
			Thread.sleep(5000);
			System.out.format("Nota fiscal emitida %nEm nome de %s %nNa data de %s %n", 
					nf.getNome(), nf.getData());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
