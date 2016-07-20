package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.pages.leilao.LeiloesPage;
import br.com.caelum.pages.leilao.NovoLeilaoPage;
import br.com.caelum.pages.usuario.UsuariosPage;

public class LeiloesSystemTest {

	private WebDriver driver;
	private LeiloesPage leiloes;

	@Before
	public void inicializa() {
		
		driver = new FirefoxDriver();
		leiloes = new LeiloesPage(driver);
		driver.get("http://localhost:8080/apenas-teste/limpa");

		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("Paulo Henrique", "paulo@henrique.com");
	
	}

	@Test
	public void deveCadastrarUmLeilao() {

		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("Fog�o", 123, "Paulo Henrique", true);

		assertTrue(leiloes.existe("Fog�o", 123, "Paulo Henrique", true));
	
	}

	@After
	public void encerra() {
	
		driver.close();
	
	}

}