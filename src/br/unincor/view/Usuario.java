package br.unincor.view;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção
 * em todos os métodos que podem vir a lançar
 * exceções por entrada incorreta do usuário. 
 *
 */
public class Usuario {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
	}

	public void exibeMsgErro(String texto) {
		JOptionPane.showMessageDialog(null, texto, "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public Integer recebeInteiro(String texto) {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog(texto));
		} catch (Exception e) {
			exibeMsg("Entrada inválida");
		} 
		
		return null;
	}

	public Double recebeDouble(String texto) {
		try {
			return Double.parseDouble(JOptionPane.showInputDialog(texto));
		} catch (Exception e) {
			exibeMsg("Entrada inválida");
		}
		
		return null;		
	}

	public String recebeTexto(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
}
