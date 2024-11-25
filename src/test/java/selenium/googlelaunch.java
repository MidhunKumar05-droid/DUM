package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
username.sendKeys("ben");
WebElement password = driver.findElement(By.id("ContentPlaceHolderBody_txtPassword"));
password.sendKeys("Password1$");
WebElement btn = driver.findElement(By.id("ContentPlaceHolderBody_btnSubmit"));
btn.click();
Thread.sleep(6000);
//driver.findElement(By.xpath("//a[@href='FLogout']")).click();
//Thread.sleep(2000);
//driver.switchTo().alert().accept();
driver.findElement(By.id("lbtnClaim")).click();
driver.findElement(By.id("lblPageName")).click();
driver.findElement(By.xpath("//a[@href='../Claims/FClaimview?Type=CI']//span[contains(text(),'Claim Intimation')]")).click();
WebElement CertificateNumber = driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtSearchCertificateNo']"));
CertificateNumber.sendKeys("101-GHI-501-24-02670069-000");
WebElement fined = driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnSearch']"));
fined.click();
Thread.sleep(5000);
WebElement dropdownElement =driver.findElement(By.id("select2-ContentPlaceHolderBody_gvClaims_ddlgvClaimType_0-container"));
dropdownElement.click();
Thread.sleep(3000);
WebElement inputbox = driver.findElement(By.xpath("//input[@role=\"textbox\"]"));
inputbox.sendKeys("hosp",Keys.ARROW_DOWN,Keys.ENTER);
Thread.sleep(3000);


//Select dropdown = new Select(dropdownElement);
//dropdown.selectByVisibleText("HospiCash-Reimbursement");
//Thread.sleep(3000);
driver.findElement(By.id("ContentPlaceHolderBody_gvClaims_imgClaimEdit_0")).click();
driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnHomeNext']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolderBody_btnprofileNext\"]")).click();

Thread.sleep(5000);
Actions actions = new Actions(driver);
actions.scrollByAmount(0, 200);
WebElement element = driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_rbtIsNetworkHospitalYes']"));
driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_rbtIsNetworkHospitalYes']"));
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolderBody_btnaccessNext\"]")).click();
//driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnHomeNext']")).click();

driver.findElement(By.xpath("//a[@href='FLogout']")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();

	}

}    
