package br.com.objective.implementations;

import javax.swing.JOptionPane;

import br.com.objective.interfaces.Controle;

/**
 * Representa os nós que ficarão nas extremidades da árvore de respostas.
 * 
 * @author Peterson Vieira Salme
 *
 */
public class NoFinal implements Controle {

	private static final String TEXTO_COMPARACAO_PRATOS = "%s é ________ mas %s não.";
	private static final String TEXTO_QUAL_PRATO_VOCE_PENSOU = "Qual prato você pensou?";
	private static final String TEXTO_ACERTEI_DE_NOVO = "Acertei de novo!";
	
	private static final String TEXTO_NOT_YET_IMPLEMENTED = "Not yet implemented";
	
	@Override
	public void respostaPositiva() {
		JOptionPane.showMessageDialog(null, TEXTO_ACERTEI_DE_NOVO);
	}
	
	@Override
	public void respostaNegativa(Controle controle) {
		String prato = JOptionPane.showInputDialog(TEXTO_QUAL_PRATO_VOCE_PENSOU);
        String caracteristica = JOptionPane.showInputDialog(
        	String.format(TEXTO_COMPARACAO_PRATOS, prato, controle.nomePrato())
        );
        controle.adicionaNivel(prato, caracteristica);
	}

	@Override
	public String nomePrato() {
		throw new UnsupportedOperationException(TEXTO_NOT_YET_IMPLEMENTED);
	}

	@Override
	public void adicionaNivel(String respostaPositiva, String respostaNegativa) {
		throw new UnsupportedOperationException(TEXTO_NOT_YET_IMPLEMENTED);
	}
	
	@Override
	public void pergunta() {
		throw new UnsupportedOperationException(TEXTO_NOT_YET_IMPLEMENTED);
	}
	
}
