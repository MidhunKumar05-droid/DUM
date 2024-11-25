package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class googlelaunch {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "path of driver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://abhiuat.gradatim.in/ABHIUAT/(S(kommw1xb2j5xlj0qdt4usjvf))/Account/FLogin");
WebElement username = driver.findElement(By.id("ContentPlaceHolderBody_txtUserName"));
username.sendKeys("Abhiuat13");
WebElement password = driver.findElement(By.id("ContentPlaceHolderBody_txtPassword"));
password.sendKeys("Password1$");
WebElement btn = driver.findElement(By.id("ContentPlaceHolderBody_btnSubmit"));
btn.click();
Thread.sleep(6000);
driver.findElement(By.xpath("//a[@href='FLogout']")).click();
Thread.sleep(2000);

driver.switchTo().alert().accept();

//tttg#gtgg



	}

}    
