package br.com.senaigo.test.AquecimentoN1;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.senaigo.test.AquecimentoN1.Jogador;
import br.com.senaigo.test.AquecimentoN1.JogoDeDados;

public class JogoTest {
	
	private JogoDeDados jogo = new JogoDeDados(10, 
												new Jogador("Primeiro"), 
												new Jogador("Segundo"), 
												new Jogador("Terceiro"));			
		
		
	
	
	@Test
	public void testVericaSeExisteJogadores() {
		assertNotNull(jogo.getJogadores());
		assertNotNull(jogo.getJogadores()[0]);
		assertNotNull(jogo.getJogadores()[1]);
	}

	@Test
	public void testMostrarVencedor() {
		jogo.iniciar(3);
		assertEquals(true, jogo.mostrarVencedor());
	}
	
	@Test
	public void testSortearIniciante() {
		Jogador[] vetor = new Jogador[50];
		for (int i = 0; i < 50; i++) {
			vetor[i] = new Jogador("jogador " + i);
		}
		jogo = new JogoDeDados(10, vetor);
		assertEquals(vetor.toString(), jogo.getJogadores().toString());
		jogo.sortearIniciante();
		assertNotEquals(vetor.toString(), jogo.getJogadores().toString());
	}
}
