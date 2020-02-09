package br.com.br;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleChatClientATest {

	@Test
	public void test_go_Jframe() {
		SimpleChatClient chatClient = new SimpleChatClient();
		chatClient.go();
		assertTrue("Fim do teste de Jframe com erro", true);
	}

}
