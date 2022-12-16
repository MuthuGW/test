package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony 
{

	public static void main(String[] args)
	{
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.tamilmatrimony.in/");
			driver.manage().window().maximize();

			
			
			  WebElement dropdown = driver.findElement(By.id("REGISTERED_BY"));
		        Select marage =new Select(dropdown);
			    
			    marage.selectByVisibleText("Myself");
			    
			    driver.findElement(By.id("NAME")).sendKeys("muthu");
			    driver.findElement(By.id("gendermale")).click();
			    
			    WebElement date = driver.findElement(By.id("DOBDAY"));
		        Select date1 =new Select(date);
			    
			    date1.selectByVisibleText("10");
			    
			    WebElement month = driver.findElement(By.id("DOBMONTH"));
		        Select month1 =new Select(month);
			    
			    month1.selectByVisibleText("Feb");
			    
			    WebElement year = driver.findElement(By.id("DOBYEAR"));
		        Select year1 =new Select(year);
			    
			    year1.selectByVisibleText("2001");
			    
			    
			    WebElement relegion = driver.findElement(By.id("RELIGION"));
		        Select relegion1 =new Select(relegion);
			    
			    relegion1.selectByVisibleText("Hindu");
			    
			    WebElement mothertongue = driver.findElement(By.id("MOTHERTONGUE"));
		        Select mt1 =new Select(mothertongue);
			    
			    mt1.selectByVisibleText("Tamil");
			    
			    WebElement country = driver.findElement(By.id("COUNTRY"));
		        Select cntry1 =new Select(country);
			    
			    cntry1.selectByVisibleText("India");
			    
			    
			    WebElement no = driver.findElement(By.id("M_COUNTRYCODE"));
		        Select num1 =new Select(no);
			    
			    num1.selectByVisibleText("+91");
			    
			    driver.findElement(By.id("MOBILENO")).sendKeys("9080937895");
			    
			    driver.findElement(By.id("EMAIL")).sendKeys("muthu30@gmail.com");
			    
		
		

	}

}
