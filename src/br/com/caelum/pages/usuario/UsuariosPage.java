package br.com.caelum.pages.usuario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UsuariosPage {

	private WebDriver driver;
	
	public UsuariosPage(WebDriver driver){
		this.driver = driver;
	}

	public void visita() {
		driver.get("localhost:8080/usuarios");
	}

	public NovoUsuarioPage novo() {
		// Clica no link de novo usuario
		driver.findElement(By.linkText("Novo Usu‡rio")).click();
		return new NovoUsuarioPage(driver);
	}

	public boolean exiteNaListagem(String nome, String email) {
		// Verifica se ambos existem na listagem
		return driver.getPageSource().contains(nome)
				&& driver.getPageSource().contains(email);
	}
}
