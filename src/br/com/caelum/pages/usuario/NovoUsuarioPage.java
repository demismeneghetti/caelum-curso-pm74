package br.com.caelum.pages.usuario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoUsuarioPage {

	private final WebDriver driver;

	public NovoUsuarioPage(WebDriver driver) {
		
		this.driver = driver;
	
	}

	public void cadastra(String nome, String email) {
	
		WebElement txtNome = driver.findElement(By.name("usuario.nome"));
		WebElement txtEmail = driver.findElement(By.name("usuario.email"));

		txtNome.sendKeys(nome);
		txtEmail.sendKeys(email);

		txtNome.submit();
	
	}
	
//	public NovoUsuarioPage novo(){

//		// CLica no link de novo usuario
//		driver.findElement(By.linkText("Novo Usu�rio")).click();
//		// Retorna a classe que representa a nova pagina
//		return new NovoUsuarioPage(driver);

//	}

}