package br.tasks.funcionais.selenium.tasks.DSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	private WebDriver driver;
	
	public DSL(WebDriver driver){
		
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void clicarNoBotao(String idBotao){
		
		driver.findElement(By.id(idBotao)).click();
	}
	
	public void escreverCampoTexto(By by, String texto){
		
		driver.findElement(by).sendKeys(texto);
	}
	
	public void escreverCampoTexto(String idCampo, String textoDoCampo){
		
		escreverCampoTexto(By.id(idCampo), textoDoCampo);
		
	}

}
