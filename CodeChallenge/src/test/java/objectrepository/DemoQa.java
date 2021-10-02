package objectrepository;

import java.awt.AWTException;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQa {

By Titulo =By.xpath("//*[text() = 'Student Registration Form']");
By Fname = By.xpath("//input[@id='firstName']");
By Lname = By.xpath("//input[@id='lastName']");
By UEmail = By.xpath("//input[@id='userEmail']");
By Rbutton =By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][3]");
By UNumber = By.xpath("//input[@id='userNumber']");
By Date =By.xpath("//input[@id='dateOfBirthInput']");
By Dtoday=By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--001 react-datepicker__day--selected react-datepicker__day--today\"]");
By Subjects = By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']/div");
By Hobbies =By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/input[@value='3']");
By Adress = By.xpath("//textarea[@id='currentAddress']");
By Estado = By.xpath("//div[@class=' css-yk16xz-control']//div[@class=' css-1wy0on6']");
By Ciudad =By.xpath("//div[@class=' css-14jk2my-container']//div[@class=' css-1wy0on6']");
By BSubmit = By.xpath("//button[@id='submit']");
By TxtSucces =By.xpath("//*[text() ='Thanks for submitting the form']");
By BtnClose =By.xpath("//button[@id='closeLargeModal']");
By CloseLabel =By.xpath("//label[@id='cbb']");


WebDriver driver;	

public DemoQa(WebDriver driver) {
	this .driver=driver;
}

public void MandarFormulario() 
{	
	if(!driver.findElements(By.xpath("//button[@id='submit']")).isEmpty()){
	      WebElement n =driver.findElement(By.xpath("//*[text() ='Submit']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);	
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        //Mensajes de Error 
		System.out.println("\n No existe Botón Submit");
    }}


public void SelectHobbie() 
{	
	if(!driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/input[@value='3']")).isEmpty()){
		System.out.println("\n Seleccionando Hobbie"); 
	      WebElement n =driver.findElement(By.xpath("//*[text() ='Music']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);	 
	    
	      WebElement a = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	      a.click();
	   
	      //WebElement b = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
	      //b.click();
	      
	      //WebElement c = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
	      //c.click();
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        //Mensajes de Error 
		System.out.println("\n No existe opciones");
    }}



public void SubjectsAdd() 
{	
	if(!driver.findElements(By.xpath("//label[@id='subjects-label']")).isEmpty()){
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='subjectsInput']"))).sendKeys("English");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'subjects-auto-complete__menu')]"))).click();			
    }else{
		System.out.println("\n No existe opciones");
    }
}


public void AllHobbie() 
{	
	if(!driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/input[@value='3']")).isEmpty()){
		System.out.println("\n Seleccionando Hobbie"); 
	      WebElement n =driver.findElement(By.xpath("//*[text() ='Music']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);	 
	    
	      WebElement a = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	      a.click();
	      
	    
	      WebElement b = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
	      b.click();

	    
	      WebElement c = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
	      c.click();
	 }else{
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	        //Mensajes de Error 
			System.out.println("\n No existe opciones");
	    }}
  

public WebElement Titulo()
{
	  return driver.findElement(Titulo);	  
}

public WebElement Name()
{
	  return driver.findElement(Fname);	  
}

public WebElement LName()
{
	  return driver.findElement(Lname);	  
}

public WebElement Email()
{
	  return driver.findElement(UEmail);	  
}


public WebElement Gender()
{
	  return driver.findElement(Rbutton);	
}

public WebElement Mobile()
{
	  return driver.findElement(UNumber);	
}

public WebElement Date()
{
	  return driver.findElement(Date);	
}

public WebElement TDate()
{
	  return driver.findElement(Dtoday);	
}

public WebElement Subjects()
{
	  return driver.findElement(Subjects);	
}

public WebElement Hobbies()
{
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Hobbies);	

	  return driver.findElement(Hobbies);	
}

public WebElement Adress()
{
	  return driver.findElement(Adress);	
}

public WebElement Estado()
{
	  return driver.findElement(Estado);	
}

public WebElement Ciudad()
{
	  return driver.findElement(Ciudad);	
}

public WebElement Summit()
{
	  return driver.findElement(BSubmit);	  
}

public WebElement FormSucces() {
	
	return driver.findElement(TxtSucces);
}

public WebElement CloseModal() {
	
	return driver.findElement(BtnClose);
}


public WebElement CloseLb() {
	
	return driver.findElement(CloseLabel);
}





public void SelectEstado()  
{	
	if(!driver.findElements(By.xpath("//*[text()='State and City']")).isEmpty()){
		System.out.println("\n Seleccionando Estado"); 
		WebDriverWait wait = new WebDriverWait(driver, 20);

		((JavascriptExecutor)driver).executeScript("return arguments[0].scrollIntoView(true);", new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#state div[class$='placeholder']"))));
		
		new WebDriverWait(driver , 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-3-input']"))).sendKeys("NCR");
		new WebDriverWait(driver ,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'react-select')]"))).click();
						
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        //Mensajes de Error 
		System.out.println("\n No existe opciones");
    }}


public void SelectCiudad() throws AWTException  
{	
	if(!driver.findElements(By.xpath("//*[text()='State and City']")).isEmpty()){
		System.out.println("\n Seleccionando Ciudad "); 
		driver.findElement(By.id("city")).click();

	    WebDriverWait wait2 = new WebDriverWait(driver, 10);
	    WebElement element2 = wait2
	            .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-4-input']")));
	    element2.sendKeys("Delhi" + Keys.ENTER);		
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        //Mensajes de Error 
		System.out.println("\n No existe opciones");
    }}


public void MessageSucces()
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement MessageS =driver.findElement(By.xpath("//*[text() ='Thanks for submitting the form']"));
	System.out.println(MessageS.getText());
}

public void CloseBtn()
{
	//((JavascriptExecutor)driver).executeScript("return arguments[0].scrollIntoView(true);", new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#state div[class$='placeholder']"))));
    WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-footer']//button[@id='closeLargeModal']")));
	element.click();
}


public void StudenRegistration()
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement Titulo =driver.findElement(By.xpath("//*[text() = 'Student Registration Form']"));
	WebElement Fname =driver.findElement(By.xpath("//input[@id='firstName']"));
	WebElement Lname =driver.findElement(By.xpath("//input[@id='lastName']"));	
}

public void Upload()
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	((JavascriptExecutor)driver).executeScript("return arguments[0].scrollIntoView(true);", new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#state div[class$='placeholder']"))));
	WebElement upload = driver.findElement(By.xpath("//label[@class='form-file-label']"));
	upload.click();
	//upload.sendKeys("/Users/omarr/Desktop/lala.png"); ponla ruta del archivo
}

public void InvalidMobile()  
{	
	if(!driver.findElements(By.xpath("//input[@id='userNumber']")).isEmpty()){ 
		WebDriverWait wait = new WebDriverWait(driver, 20);

		((JavascriptExecutor)driver).executeScript("return arguments[0].scrollIntoView(true);", new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#state div[class$='placeholder']"))));
		
		new WebDriverWait(driver , 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userNumber']"))).sendKeys("OMAR123456");
		new WebDriverWait(driver ,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit']"))).click();
	    System.out.println("Mobile : Error, Ingresa Solo Números");		
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement MessageS =driver.findElement(By.xpath("//*[text() ='Thanks for submitting the form']"));
    	System.out.println(MessageS.getText());
    }}


public void InvalidFormularioEmail() 
{	
	if(!driver.findElements(By.xpath("//button[@id='submit']")).isEmpty()){
	      WebElement n =driver.findElement(By.xpath("//*[text() ='Submit']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);	
	      n.click();
	      System.out.println("Email : Error,Favor de Revisar Formato");
    }else{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement MessageS =driver.findElement(By.xpath("//*[text() ='Thanks for submitting the form']"));
    	System.out.println(MessageS.getText());
    }}
    


}
