package br.com.br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SimpleChatClient {
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public void go() {
		JFrame jFrame = new JFrame("Ludicrously simple chat Client");
		jFrame.setVisible(true);
		jFrame.setSize(400, 500);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setUpNetworking() {
		//cria um objeto Socket e, em seguida um objeto PrintWriter
		//atribui o objeto PrintWriter a variável de instância Writer

	}
	
	public class SendButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO captura o texto no campo de texto e o envia para o servidor usando o objeto de gravação (um objeto PrintWriter)
		}
	}

}
