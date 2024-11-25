package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chatgptcode {

    @Test
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the webpage
        driver.get("https://abhiuat.gradatim.in/ABHIUAT/(S(kommw1xb2j5xlj0qdt4usjvf))/Account/FLogin");

        // Log in
        WebElement username = driver.findElement(By.id("ContentPlaceHolderBody_txtUserName"));
        username.sendKeys("ben");
        WebElement password = driver.findElement(By.id("ContentPlaceHolderBody_txtPassword"));
        password.sendKeys("Password1$");
        WebElement btn = driver.findElement(By.id("ContentPlaceHolderBody_btnSubmit"));
        btn.click();

        // Wait for login to complete
        Thread.sleep(6000);

        // Navigate to the claim section
        driver.findElement(By.id("lbtnClaim")).click();
        driver.findElement(By.id("lblPageName")).click();
        driver.findElement(By.xpath("//a[@href='../Claims/FClaimview?Type=CI']//span[contains(text(),'Claim Intimation')]")).click();

        // Search for a certificate
        WebElement certificateNumber = driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtSearchCertificateNo']"));
        certificateNumber.sendKeys("101-GHI-501-24-02670069-000");
        WebElement fined = driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnSearch']"));
        fined.click();

        // Wait for the search results
        Thread.sleep(5000);

        // Select an option from the dropdown
        WebElement dropdownElement = driver.findElement(By.id("select2-ContentPlaceHolderBody_gvClaims_ddlgvClaimType_0-container"));
        dropdownElement.click();
        Thread.sleep(3000);
        WebElement inputbox = driver.findElement(By.xpath("//input[@role='textbox']"));
        inputbox.sendKeys("hosp", Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(3000);

        // Edit claim
        WebElement edit = driver.findElement(By.id("ContentPlaceHolderBody_gvClaims_imgClaimEdit_0"));
        edit.click();

        // Navigate through claim details
        WebElement memNext = driver.findElement(By.id("ContentPlaceHolderBody_btnHomeNext"));
        memNext.click();
        driver.findElement(By.id("ContentPlaceHolderBody_btnprofileNext")).click();
        driver.findElement(By.id("ContentPlaceHolderBody_btnaccessNext")).click();

        // Close the browser
        driver.quit();
    }
}