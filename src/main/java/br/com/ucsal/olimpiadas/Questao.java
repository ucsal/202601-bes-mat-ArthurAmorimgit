package br.com.ucsal.olimpiadas;

import java.util.Arrays;

public class Questao {

	private long id;
	private long provaId;

	private String enunciado;
	private String[] alternativas = new String[5];
	private CorrecaoQuestao correcao;
	private char alternativaCorreta;

	private String fenInicial;

	public String getFenInicial() {
		return fenInicial;
	}

	public void setFenInicial(String fenInicial) {
		this.fenInicial = fenInicial;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProvaId() {
		return provaId;
	}

	public void setProvaId(long provaId) {
		this.provaId = provaId;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String[] getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String[] alternativas) {
		if (alternativas == null || alternativas.length != 5) {
			throw new IllegalArgumentException("A questão deve possuir exatamente 5 alternativas.");
		}
		this.alternativas = Arrays.copyOf(alternativas, 5);
	}



	public boolean isRespostaCorreta(char marcada) {
		return correcao.corrigir(this, normalizar(marcada));
	}

	public static char normalizar(char c) {
		char up = Character.toUpperCase(c);
		if (up < 'A' || up > 'E') {
			throw new IllegalArgumentException("Alternativa deve estar entre A e E.");
		}
		return up;
	}

	public CorrecaoQuestao getCorrecao() {
		return correcao;
	}

	public void setCorrecao(CorrecaoQuestao correcao) {
		this.correcao = correcao;

	}

	public char getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(char alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
}
