package br.com.uoldiveo.painel.mss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovoOrcamentoPage {

	private WebDriver driver;
	
	public NovoOrcamentoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void solicita (String prodserv, String informacoes){
		
		Select cbProdutoServico = new Select(driver.findElement(By.id("idClassificationCall")));
		cbProdutoServico.selectByVisibleText(prodserv);
		
		WebElement txtDescricao = driver.findElement(By.id("call-infotext"));
		txtDescricao.sendKeys("Solicitação Automatizada de Teste");
		
		txtDescricao.submit();
	}
}
