package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class UiBank 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new 	ChromeDriver();
		driver.get("https://uibank.uipath.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.id("firstName")).sendKeys("muthu");
		WebElement Title = driver.findElement(By.id("title"));
		 Select titledrop=new Select(Title);
		 titledrop.selectByVisibleText("Mr");
		 driver.findElement(By.id("middleName")).sendKeys("gowres");
		 driver.findElement(By.id("lastName")).sendKeys("waran");
		WebElement Sex = driver.findElement(By.id("sex"));
		 Select Sexdrop=new Select(Sex);
		 Sexdrop.selectByVisibleText("Male");
		 WebElement EmploymentStatus = driver.findElement(By.id("employmentStatus"));
		 Select EmploymentStatusdrop=new Select(EmploymentStatus);
		 EmploymentStatusdrop.selectByVisibleText("Full-time");
		 WebElement MaritalStatus = driver.findElement(By.id("maritalStatus"));
		 Select MaritalStatusdrop=new Select(MaritalStatus);
		 MaritalStatusdrop.selectByVisibleText("Single");
		 driver.findElement(By.id("username")).sendKeys("muthugowres");
		 driver.findElement(By.id("email")).sendKeys("muthu@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("#Waran120");
		 


	}

}
