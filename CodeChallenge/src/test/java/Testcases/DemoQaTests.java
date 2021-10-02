package Testcases;

import java.awt.AWTException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.DemoQa;

public class DemoQaTests {
	
	
	public static void main(String[] args) {
	}
	
	@Test //Registro Formulario Todos los Campos 
	public void Registro() throws AWTException
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Titulo().getText(); 
		dm.Name().sendKeys("Omar"); 
		dm.LName().sendKeys("Rodriguez");
		dm.Email().sendKeys("omar.rodriguez@gmail.com");
		dm.Gender().click();
		dm.Mobile().sendKeys("5561924352");
		dm.SelectHobbie();
		dm.Adress().sendKeys("Lomas Verdes 666");
		dm.SelectEstado();
		dm.SelectCiudad();
		dm.Summit().click();
		dm.FormSucces();
	    dm.MessageSucces();
	    driver.quit();
	}

	
	@Test  // Validar que se puedan seleccionar todos los botones Hobbies
	public void AllHobbies()
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Titulo().getText(); 
		dm.AllHobbie();
		driver.quit();
	}
	
	@Test  // Validar que se Pueda Ingresar información en el campo Subject
	public void VSubject()
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.SubjectsAdd();
		driver.quit();
	}
	 
	
	@Test //Registro Campos solo los Minimos Requeridos 
	public void RegistroBasico() throws AWTException
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Titulo().getText(); 
		dm.Name().sendKeys("Omar"); 
		dm.LName().sendKeys("Rodriguez");
		dm.Email().sendKeys("omar.rodriguez@gmail.com");
		dm.Gender().click();
		dm.Mobile().sendKeys("5561924352");
		dm.MandarFormulario();
		dm.Summit().click();
		dm.FormSucces();
	    dm.MessageSucces();
	    driver.quit();
	}
	
	 
	
	@Test  // Validar que se Pueda Subir un Archivo
	public void Up()
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Upload();
		driver.quit();
	}
	
	@Test  // Validar que que El campo mobile (Numero Telefonico) se muestre error al ingresar datos alfanúmericos
	public void InvalidMobi()
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Titulo().getText(); 
		dm.Name().sendKeys("Omar"); 
		dm.LName().sendKeys("Rodriguez");
		dm.Email().sendKeys("omar.rodriguez@gmail.com");
		dm.Gender().click();
		dm.Mobile().sendKeys("OMAR123456");
		dm.InvalidMobile();
		dm.MandarFormulario();
		dm.Summit().click();
		driver.quit();
	}  
	
	@Test  // Validar que que El campo Email No acepte formato invalido
	public void InvaliEmail()
	{	
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
		DemoQa dm = new DemoQa(driver);
		driver.manage().window().maximize();
		dm.Titulo().getText(); 
		dm.Name().sendKeys("Omar"); 
		dm.LName().sendKeys("Rodriguez");
		dm.Email().sendKeys("lala.lala.com");
		dm.Gender().click();		
		dm.Mobile().sendKeys("5561824353");
		dm.InvalidFormularioEmail();
		driver.quit();
	}
	
	
}
