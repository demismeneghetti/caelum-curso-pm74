package br.com.caelum.automatizando.testes.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class TesteAutomatizado {
 
    public static void main(String[] args) {
        // abre firefox
        WebDriver driver = new FirefoxDriver();
         
        // acessa o site do google
        driver.get("http://www.google.com.br/");
         
        // Insere o texto no campo "q" do Google!
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");
         
        // submete o formulário!
        campoDeTexto.submit();
        
        // realiza o print do resultado!

        // fecha o navegador Firefox
        // driver.close();
        // driver.quit();
    }
}

