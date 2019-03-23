package br.com.senaigo.test.AquecimentoN1;

import org.junit.Test;

import junit.framework.TestCase;

public class JogoDados extends TestCase{
	
	Jogador jogador = new Jogador();

	@Test
	public void jogarDadosTest() {
		assertEquals(true,Dado.jogarDado(jogador));
	}

	
}
