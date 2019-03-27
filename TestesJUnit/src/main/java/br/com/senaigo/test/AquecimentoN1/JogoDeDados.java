package br.com.senaigo.test.AquecimentoN1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class JogoDeDados {
	private int objetivo;
	private Jogador[] jogadores;

	public JogoDeDados(int objetivo, Jogador ...jogadores) {
		this.objetivo = objetivo;
		this.jogadores = jogadores;
	}
	
	public int getObjetivo() {
		return objetivo;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public Jogador getJogadores(int pos) {
		return jogadores[pos];
	}

	public void sortearIniciante() {
		Map<Integer, Jogador> mapa = new TreeMap<Integer, Jogador>();
		Random random = new Random();
		for (int i = 0; i < jogadores.length; i++) {
			int key;
			do {
				key = random.nextInt(10000);
			} while (mapa.containsKey(key));

			mapa.put(key, jogadores[i]);
		}
		Jogador[] vet = new Jogador[jogadores.length];
		int i = 0;
		for(Integer key : mapa.keySet()) {
			vet[i] = mapa.get(key);
			i ++;
		}
		jogadores = vet;
	}
	
	public void iniciar(int ladosDado) {
		Dado dado = new Dado(ladosDado);
		do {
			sortearIniciante();
			Integer maior = 0;
			List<Jogador> vencedores = new LinkedList<Jogador>();
			Map<Jogador, Integer> rodada = new HashMap<Jogador, Integer>();
			for (int i = 0; i < jogadores.length; i++) {
				rodada.put(jogadores[i], dado.jogarDados());
				if(rodada.get(jogadores[i]) > maior) {
					maior = rodada.get(jogadores[i]);
					vencedores = new LinkedList<Jogador>();
					vencedores.add(jogadores[i]);
				}
				else if(rodada.get(jogadores[i]) == maior) {
					vencedores.add(jogadores[i]);
				}
			}
			for(Jogador jogador : vencedores) {
				jogador.aumentarPontos();
			}
			this.mostrarSituacao();
		} while (!mostrarVencedor());
	}

	public boolean mostrarVencedor() {
		for (int i = 0; i < jogadores.length; i++) {
			if(jogadores[i].ganhou()) {
				System.out.println("Vencedor == " + jogadores[i].nome);
				return true;
			}
		}
		System.out.println("Não há um Vencedor");
		return false;
	}
	
	public void mostrarSituacao() {
		StringBuilder resultado = new StringBuilder("\n");
		for (int i = 0; i < jogadores.length; i++) {
			resultado.append("Jogador ").append(jogadores[i].nome).append("pontos == ").append(jogadores[i].pontos).append("\n");
		}
		System.out.println(resultado.toString());
	}
	
}