package br.com.objective.interfaces;

public interface Controle {

	void pergunta();
	
	void respostaPositiva();
	
	void respostaNegativa(Controle controle);
	
	String nomePrato();
	
	void adicionaNo(String respostaPositiva, String respostaNegativa);
	
}
