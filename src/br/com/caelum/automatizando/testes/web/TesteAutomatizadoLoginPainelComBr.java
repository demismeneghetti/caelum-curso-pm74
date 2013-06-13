package br.com.caelum.automatizando.testes.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizadoLoginPainelComBr {

	@Test
	public static void main(String[] args) {

		// Para executar via Windows
		// File fileDriver = new File(
		// "C:\\Users\\cad_dmeneghetti\\Documents\\GitHub\\caelum-curso-pm74\\drivers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// fileDriver.getAbsolutePath());

		// Para executar via Mac
		// File fileDriver = new File(
		// "/Users/demismeneghetti/git/caelum-curso-pm74/drivers/chromedriver");
		// System.setProperty("webdriver.chrome.driver",
		// fileDriver.getAbsolutePath());

		// abre firefox
		WebDriver driver = new FirefoxDriver();

		// acessa o site do google
		driver.get("http://painel.uoldiveo.com.br/");

		// digita no username o usuário de acesso
		WebElement campoUsername = driver.findElement(By.id("username"));
		campoUsername.sendKeys("bobesponja@azul");

		// digita no campo com nome "q" do google
		WebElement campoPassword = driver.findElement(By.id("password"));
		campoPassword.sendKeys("seja100%");

		// submete o form
		campoPassword.submit();

		// Fecha o navegador.
		// driver.wait(10);
		// driver.close();
		// driver.quit();
	}
}