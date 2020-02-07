package br.com.br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
	public void go() {
		try {
			// Estabelece conexão com um servidor
			Socket s = new Socket("127.0.0.01", 4242);
			
//			Para LEITURA DO SERVIDOR cria-se um objeto de LEITURA que recebe um objeto de SAIDA
//			de DADOS DO SERVIDOR
			InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
			
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String advice = bufferedReader.readLine();
			
			System.out.println("Today you should: "+ advice);
			
			bufferedReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println(e);
			
		}
		
	}
	public static void main(String[] args) {
		DailyAdviceClient dailyAdviceClient = new DailyAdviceClient();
		dailyAdviceClient.go();
	}

}
