package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.pages.leilao.DetalhesDoLeilaoPage;
import br.com.caelum.pages.leilao.LeiloesPage;
import br.com.caelum.pages.usuario.UsuariosPage;

public class LanceSystemTest {

	private FirefoxDriver driver;
	private LeiloesPage leiloes;

	@Before
	public void inicializa() {

		driver = new FirefoxDriver();
		leiloes = new LeiloesPage(driver);

		// Cenario padrao
		driver.get("http://localhost:8080/apenas-teste/limpa");

		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("Paulo Henrique", "paulo@henrique.com");
		usuarios.novo().cadastra("José Eduardo", "jose@eduardo.com");

		leiloes.visita();
		leiloes.novo().preenche("Geladeira", 100, "Paulo Henrique", false);

	}

	@Test
	public void deveFazerUmLance() {

		DetalhesDoLeilaoPage lances = leiloes.detalhes(1);

		lances.lance("José Eduardo", 150);

		assertTrue(lances.existeLance("José Eduardo", 150.0));

	}

	@After
	public void encerra() {

		driver.close();

	}

}