package br.com.br;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	String[] advice = {"Ore a Deus sempre", "Mantenha uma boa alimentação", "Faça exercício físico"};
	public void go() {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(4242);
			while (true) {
				Socket socket = serverSocket.accept();
//				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
//				BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
				String advice = getAdvice();
				printWriter.println(advice);
				printWriter.close();
				System.out.println(advice);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private String getAdvice() {
		int numberAdviceRandom = (int) (Math.random() * advice.length);
		return advice[numberAdviceRandom];
	}
	public static void main(String[] args) {
		DailyAdviceServer dailyAdviceClient = new DailyAdviceServer();
		dailyAdviceClient.go();
	}
}
