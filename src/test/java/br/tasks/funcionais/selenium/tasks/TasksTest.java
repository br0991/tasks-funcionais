package br.tasks.funcionais.selenium.tasks;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.task.funcionais.selenium.tasks.utils.BrowserUtil;
import br.tasks.funcionais.selenium.taks.pages.CadastraTaskPage;
import br.tasks.funcionais.selenium.taks.pages.HomePage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TasksTest {

	private static HomePage home;
	private static CadastraTaskPage cadastraTask;
	
	@BeforeClass
	public static void setup(){

		new BrowserUtil();
		home = new HomePage();
		cadastraTask = new CadastraTaskPage();
	}
	@Test
	public void t01_deveClicarNoBotao(){
		
		home.clicarNoBotao();
	}
	
	@Test
	public void t02_deveCadastrarUmaTaskValida(){
		
		cadastraTask.preencherCampoTask("Teste cadastro");
		cadastraTask.preencherCampoDueDate("17/04/2021");
		cadastraTask.clicarNoBotao();
	}
}
