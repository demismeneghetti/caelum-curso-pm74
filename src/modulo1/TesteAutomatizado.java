package modulo1;

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
         
        // digita no campo com nome "q" do google
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");
         
        // submete o form
        campoDeTexto.submit();

        // fecha o navegador Firefox
        driver.close();
        driver.quit();
    }
}

