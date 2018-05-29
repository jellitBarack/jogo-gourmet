package br.com.objective.implementations;

import javax.swing.JOptionPane;

import br.com.objective.interfaces.Controle;

/**
 * Classe No ( Nó ), representa cada pergunta/resposta do jogo. 
 * 
 * @author Peterson Vieira Salme
 *
 */
public class No implements Controle {

	private static final String TEXTO_PERGUNTA_PRATO_PENSADO = "O prato que você pensou é %s?";
	
	private String nomePrato;
	
	private Controle noPositivo;
	private Controle noNegativo;
	
	public No(String nomePrato) {
		this.nomePrato = nomePrato;
		this.noPositivo = new NoFinal();
		this.noNegativo = new NoFinal();
	}
	
	public void defineOpcoesIniciais(String opcaoPositiva, String opcaoNegativa) {
		this.adicionaNo(opcaoPositiva, opcaoNegativa);
	}

	public void pergunta() {
		String pergunta = String.format(TEXTO_PERGUNTA_PRATO_PENSADO, this.nomePrato);
		int resposta = JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION);
		
		if ( Integer.valueOf(resposta).equals(JOptionPane.YES_OPTION) ) {
			this.noPositivo.respostaPositiva();
		} else {
			this.noNegativo.respostaNegativa(this);
		}
	}

	@Override
	public void respostaPositiva() {
		this.pergunta();
	}

	@Override
	public void respostaNegativa(Controle controle) {
		this.pergunta();
	}

	@Override
	public String nomePrato() {
		return this.nomePrato;
	}

	@Override
	public void adicionaNo(String respostaPositiva, String respostaNegativa) {
		this.noPositivo = new No(respostaPositiva);
		this.noNegativo = new No(respostaNegativa);
	}
}
