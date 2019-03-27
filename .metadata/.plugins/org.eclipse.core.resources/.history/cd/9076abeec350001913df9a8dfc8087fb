package br.com.senaigo.test.AquecimentoN1;

import java.util.Random;

public class Dado {

	public static boolean jogarDado(Jogador jogador) {
		
		Random rand = new Random();
		int valorJogado = rand.nextInt(6)+1;		
		jogador.aumentarPontos(valorJogado);
		if(valorJogado > 0 && valorJogado <= 6){
			return true;
		}
		return false;
	}

}
