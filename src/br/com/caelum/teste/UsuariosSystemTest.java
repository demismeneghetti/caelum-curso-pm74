package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.pages.usuario.UsuariosPage;

public class UsuariosSystemTest {

	private FirefoxDriver driver;
	private UsuariosPage usuarios;
	
	@Before
	public void inicializa() {
		this.driver = new FirefoxDriver();
		this.usuarios = new UsuariosPage(driver);
	}

	@Test
	public void deveAdicionarUmUsuario() {

		usuarios.visita();
		usuarios.novo()
		.cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");
		
		assertTrue(usuarios.exiteNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
	}

	@After
	public void encerra() {
		driver.close();
	}
}