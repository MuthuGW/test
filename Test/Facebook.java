package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) 
	{
	   
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9061909%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAqOucBhDrARIsAPCQL1YlP7_fsOY1Wg0PeOt6jbojeoTbSszz80M-JN3yiogbYzqWG5Xj-eEaAsCcEALw_wcB");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("muthu");
	    driver.findElement(By.name("lastname")).sendKeys("gowreswaran");
	    driver.findElement(By.name("reg_email__")).sendKeys("muthu@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("muthu@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("#Waran");
	    WebElement Dateofbirth =driver.findElement(By.name("birthday_day"));
        Select brithday = new Select(Dateofbirth);
        brithday.selectByIndex(19);
        WebElement dateofmonth =driver.findElement(By.name("birthday_month"));
        Select Day=new Select(dateofmonth);
        Day.selectByIndex(5);
        WebElement brithofyear =driver.findElement(By.name("birthday_year"));
        Select year =new Select(brithofyear);
        year.selectByIndex(20);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
	}
	

}
