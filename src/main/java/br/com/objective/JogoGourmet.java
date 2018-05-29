package br.com.objective;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.objective.implementations.No;

public class JogoGourmet {

	private static final String TEXTO_PENSE_EM_UM_PRATO = "Pense em um prato que gosta.";
	
	public static void main(String[] args) {
		JogoGourmet jogo = new JogoGourmet();
		jogo.start();		
	}
	
	private void start() {
		final No no = new No("massa");
		no.defineOpcoesIniciais("Lazanha", "Bolo de Chocolate");
		
		JFrame jframe = new JFrame("Jogo Gourmet");
		JLabel jlabel = new JLabel(TEXTO_PENSE_EM_UM_PRATO);
		JButton jbuttonOk = new JButton("OK");
		
        jframe.setSize(300, 200);
        jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		
		jlabel.setBounds(50, 40, 200, 30);
		jframe.add(jlabel);
		
		jbuttonOk.setBounds(90, 100, 100, 30);
		jframe.add(jbuttonOk);
		
		jbuttonOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				no.pergunta();
			}
		});
	}
	
}
