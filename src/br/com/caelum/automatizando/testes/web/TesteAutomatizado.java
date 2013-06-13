package br.com.caelum.automatizando.testes.web;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	public static void main(String[] args) throws InterruptedException {
		File fileDriver = new File(
				"/Users/demismeneghetti/git/caelum-curso-pm74/drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver",
				fileDriver.getAbsolutePath());

		// abre firefox
		WebDriver driver = new ChromeDriver();

		// acessa o site do google
		driver.get("http://www.google.com.br/");

		// digita no campo com nome "q" do google
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("Demis Meneghetti");

		// submete o form
		campoDeTexto.submit();

		// Fecha o navegador.
		//driver.wait(10);
		//driver.close();
		//driver.quit();
	}
}