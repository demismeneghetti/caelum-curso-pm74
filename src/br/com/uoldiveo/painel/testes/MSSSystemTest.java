package br.com.uoldiveo.painel.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.uoldiveo.painel.mss.NovoOrcamentoPage;

public class MSSSystemTest {

	private FirefoxDriver driver;
	private NovoOrcamentoPage mss;
	
	@Before
	public void inicializa(){
		driver = new FirefoxDriver();
		mss = new NovoOrcamentoPage(driver);
	}
	
	@Test
	public void solicita(){
		mss.solicita(prodserv, informacoes)
		mss.
	}
	
	@After
	public void encerra() {
		driver.close();
	}

}
