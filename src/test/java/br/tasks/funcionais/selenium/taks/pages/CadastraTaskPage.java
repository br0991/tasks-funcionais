package br.tasks.funcionais.selenium.taks.pages;

import br.task.funcionais.selenium.tasks.utils.BrowserUtil;
import br.tasks.funcionais.selenium.tasks.DSL.DSL;

public class CadastraTaskPage {
	
	private DSL dsl;
	
	public CadastraTaskPage(){
		
		dsl = new DSL(BrowserUtil.getDriver());
	}
	public void clicarNoBotao(){
		
		dsl.clicarNoBotao("saveButton");
	}
	
	public void preencherCampoTask(String texto){
		
		dsl.escreverCampoTexto("task", texto);
	}
	
	public void preencherCampoDueDate(String texto){
		
		dsl.escreverCampoTexto("dueDate", texto);
	}
}
