package br.com.br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JTextField;

public class SimpleChatClientA {
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public void go() {
		// cria a gui e registra um ouvinte no bot�o send
		// chama o m�todo setUpNetworking()
	}

	private void setUpNetworking() {
		//cria um objeto Socket e, em seguida um objeto PrintWriter
		//atribui o objeto PrintWriter a vari�vel de inst�ncia Writer

	}
	
	public class SendButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO captura o texto no campo de texto e o envia para o servidor usando o objeto de grava��o (um objeto PrintWriter)
		}
	}

}
