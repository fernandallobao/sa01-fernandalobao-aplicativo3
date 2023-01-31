package br.com.javatagua.sa1.app3;//pacote


import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.AssentoBO;

//um pacote é um conjunto de classe

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recebe a resposta em String 
		String resp = JOptionPane.showInputDialog("Digite a quantidade de aviões: ");
		//e converte a resposta para inteiro
		int qtdeAvioes = Integer.parseInt(resp);
		
		//criando o objeto
		AssentoBO abo = new AssentoBO();
		
		JOptionPane.showMessageDialog(null, "Quantidade Geral de Assentos " + abo.calcularAssentos(qtdeAvioes));
		
		
	}

}
