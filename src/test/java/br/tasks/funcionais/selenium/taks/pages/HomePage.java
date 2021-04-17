package br.tasks.funcionais.selenium.taks.pages;

import br.task.funcionais.selenium.tasks.utils.BrowserUtil;
import br.tasks.funcionais.selenium.tasks.DSL.DSL;

public class HomePage {
	
	private DSL dsl;
	
	public HomePage(){
		
		dsl = new DSL(BrowserUtil.getDriver());
	}
	public void clicarNoBotao(){
		
		dsl.clicarNoBotao("addTodo");
	}
}
