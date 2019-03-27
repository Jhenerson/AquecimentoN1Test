package br.com.senaigo.test.AquecimentoN1;

import java.util.Random;

public class Dado {

	private Random random;
	private int numeroDeLados;

	private Dado() {
		random = new Random();
	}

	public Dado(int numeroDeLados) {
		this();
		this.numeroDeLados = numeroDeLados;
	}

	public int jogarDados() {
		if (numeroDeLados < 2) {
			return numeroDeLados;
		} else {
			int pos = 1 + random.nextInt(numeroDeLados);
			return pos;
		}
	}

}
