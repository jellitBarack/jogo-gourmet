package br.com.objective;

import javax.swing.JOptionPane;

import br.com.objective.implementations.No;

public class JogoGourmet {

	private static final String TEXTO_PENSE_EM_UM_PRATO = "Pense em um prato que gosta.";
	
	public static void main(String[] args) {
	    JOptionPane.showMessageDialog(null, TEXTO_PENSE_EM_UM_PRATO, "", JOptionPane.INFORMATION_MESSAGE);
	    
	    No no = new No("massa");
	    no.adicionaNo("Lazanha", "Bolo de Chocolate");
	    
	    no.pergunta();
	    
	}
	
}
