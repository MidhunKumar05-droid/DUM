package selenium ;


import java.awt.AWTException;

import java.awt.Robot;

import java.awt.Toolkit;

import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;

import java.time.Duration;

import java.util.List;



import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Parameters;

public class masterpolicy {


@SuppressWarnings("unused")

@Test(priority = 1)

@Parameters("myName")

public void MakerNew() throws InterruptedException, AWTException {

// Basic Details Section


WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

driver.get("https://abhiuat.gradatim.in/ABHIUAT/(S(fm1elehferlg2aubcztqzzrq))/Account/FLogin");

driver.findElement(By.xpath("//label[contains(text(),'Username')]"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtUserName']")).sendKeys("ABHIUAT10");

driver.findElement(By.xpath("//label[contains(text(),'Password')]"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtPassword']")).sendKeys("Password1$");

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnSubmit']")).click();

driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]/span[1]")).click();

driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();

driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();

driver.findElement(By.xpath("//span[contains(text(),'Master Policy Holder - Maker')]")).click();

driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]")).click();

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblGroupName']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtGroupName']")).sendKeys("MMTDOMAIRAUU");

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblRiskCategory']"));

WebElement RiskDetails = driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlRiskCategory-container"));

Actions actions = new Actions(driver); actions.moveToElement(RiskDetails).click().build().perform();

//driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlRiskCategory-container")).click();//click on that combo

//for(int i = 0 ; i <= 3; i++ ){

Actions Risk = new Actions(driver);

Risk.sendKeys("Risk Category 3").build().perform();//press down arrow key

Actions Risk1 = new Actions(driver);

Risk1.sendKeys(Keys.ENTER).build().perform();//press enter*/

//break;

//}

Thread.sleep(2000);

// driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblBuiness']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtBusiness']")).sendKeys("Business1");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblGeoStructure']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_rbnIsGeoStructureYes']")).click();

Thread.sleep(2000);

WebElement SMSNotification = driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlIsSMSNotifications-container"));

Actions SMSactions = new Actions(driver); SMSactions.moveToElement(SMSNotification).click().build().perform();

for(int i = 0; i <= 1; i++){

Actions SMSNoti = new Actions(driver);

SMSNoti.sendKeys(Keys.DOWN).build().perform();//press down arrow key

Actions SMSNoti1 = new Actions(driver);

SMSNoti1.sendKeys(Keys.ENTER).build().perform();//press enter

break;

}

Thread.sleep(2000);

WebElement EMAILNotification = driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlIsEMailNotifications-container"));

Actions EMAILactions = new Actions(driver); EMAILactions.moveToElement(EMAILNotification).click().build().perform();

for(int i = 0; i <= 1; i++){

Actions EMAILNoti = new Actions(driver);

EMAILNoti.sendKeys(Keys.DOWN).build().perform();//press down arrow key

Actions EMAILNoti1 = new Actions(driver);

EMAILNoti1.sendKeys(Keys.ENTER).build().perform();//press enter

break;

}

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtDocumentName']")).sendKeys("Test");

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_fuAdditionalFileUpload']")).sendKeys("C:\\Users\\USER\\Desktop\\Sirini UAT details.txt");

driver.findElement(By.name("ctl00$ContentPlaceHolderBody$btnAdditionalFileUpload")).click();

WebElement FileUPE = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));

if (FileUPE.isDisplayed() && FileUPE.isEnabled()) {

FileUPE.click();

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnSaveBase']")).click();

}

// Contact Persons Details

// driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblSalutation']"));

WebElement SalU = driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlSalutation-container"));

Actions actions1 = new Actions(driver); actions1.moveToElement(SalU).click().build().perform();

for(int i = 0; i <= 3; i++){

Actions SalAct = new Actions(driver);

SalAct.sendKeys(Keys.DOWN).build().perform();//press down arrow key

Actions SalAct1 = new Actions(driver);

SalAct1.sendKeys(Keys.ENTER).build().perform();//press enter

break;

}

Thread.sleep(3000);

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblFirstName']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtFirstName']")).sendKeys("Ganesan");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblMiddlename']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtMiddleName']")).sendKeys("K");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblLastName']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtLastName']")).sendKeys("Kaleeswaran");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblMobileNumber']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtMobileNumber']")).sendKeys("1234567890");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblIsPrimayContact']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_chkIsPrimaryContact']")).click();

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_lblEmailID']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtEMailID']")).sendKeys("ganesh@gmail.com");

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnAddContactPerson']")).click();

WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));

if (element1.isDisplayed() && element1.isEnabled()) {

element1.click();

}

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_btnSaveContact']")).click();

// Geo Structure Details

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblTypeGeo']"));

//Thread.sleep(10000);

WebElement Type = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlType-container"));

Actions actions2 = new Actions(driver); actions2.moveToElement(Type).click().build().perform();

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

//Thread.sleep(10000);

//for(int i = 0; i <= 1; i++)

//{

Actions TypeAct = new Actions(driver);

TypeAct.sendKeys("others").build().perform();//press down arrow key

Actions TypeAct1 = new Actions(driver);

TypeAct1.sendKeys(Keys.ENTER).build().perform();//press enter

// break;

//}

Thread.sleep(3000);

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblUnitName']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtUnitName']")).sendKeys("Group 1");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblPAN']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtPANNo']")).sendKeys("DDDDD5555D");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblServicingBranch']"));

WebElement SerBranch = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlServicingBranch-container"));

Actions actions3 = new Actions(driver); actions3.moveToElement(SerBranch).click().build().perform();

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

for(int i = 0; i <= 1; i++)

{

Actions Serbranch = new Actions(driver);

Serbranch.sendKeys(Keys.DOWN).build().perform();//press down arrow key

Actions Serbranch1 = new Actions(driver);

Serbranch1.sendKeys(Keys.ENTER).build().perform();//press enter

break;

}

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblReportingToGeo']"));

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

//WebElement Reportingto = driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]"));

// Actions actions4 = new Actions(driver); actions4.moveToElement(Reportingto).click().build().perform();

// for(int i = 0; i <= 0; i++)

//{

// Actions Repto = new Actions(driver);

// Repto.sendKeys(Keys.DOWN).build().perform();//press down arrow key

// Actions Repto1 = new Actions(driver);

// Repto1.sendKeys(Keys.ENTER).build().perform();//press enter

// break;

// }

Thread.sleep(5000);

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblGSTNo']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtGSTNo']")).sendKeys("27DDDDD5555D1Z8");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblAddress1Gst']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtAddress1Gst']")).sendKeys("1A sadagopan enclave");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblAddress2Gst']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtAddress2Gst']")).sendKeys("Kannappan st");

driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblAddress3Gst']"));

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtAddress3Gst']")).sendKeys("Nanmangalam");

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblZipCode']"));

//driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_txtZipCodeGst']")).sendKeys("400022");

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblCountry']"));

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

/*WebElement Country = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlCountry-container"));

Actions actions5 = new Actions(driver); actions5.moveToElement(Country).click().build().perform();

for(int i = 0; i <= 0; i++)

{

Actions CountryDetail = new Actions(driver);

CountryDetail.sendKeys(Keys.DOWN).build().perform();//press down arrow key

Actions CountryDetail1= new Actions(driver);

CountryDetail1.sendKeys(Keys.ENTER).build().perform();//press enter

break;


}*/

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblState']"));

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

Thread.sleep(5000);

WebElement State = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlState-container"));

Actions actions6 = new Actions(driver); actions6.moveToElement(State).click().build().perform();

//for(int i = 0; i <= 5; i++)

//{

Actions StateDetails = new Actions(driver);

StateDetails.sendKeys("Maharashtra").build().perform();//press down arrow key

Actions StateDetails1= new Actions(driver);

StateDetails1.sendKeys(Keys.ENTER).build().perform();//press enter

//break;

//}

Thread.sleep(5000);

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblDistrict']"));

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

WebElement District = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlDistrict-container"));

Actions actions7 = new Actions(driver); actions7.moveToElement(District).click().build().perform();

// for(int i = 0; i <= 3; i++)

//{

Actions DistrictDetails = new Actions(driver);

DistrictDetails.sendKeys("Pune").build().perform();//press down arrow key

Actions DistrictDetails1= new Actions(driver);

DistrictDetails1.sendKeys(Keys.ENTER).build().perform();//press enter

//break;

//}

Thread.sleep(4000);

//driver.findElement(By.xpath("//span[@id='ContentPlaceHolderBody_ucMPAddress_lblTaluk']"));

//driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();//click on that combo

WebElement Taluk = driver.findElement(By.id("select2-ContentPlaceHolderBody_ucMPAddress_ddlTaluk-container"));

Actions actions8 = new Actions(driver); actions8.moveToElement(Taluk).click().build().perform();

//for(int i = 0; i <= 2; i++)

//{

Actions TalukDetails = new Actions(driver);

TalukDetails.sendKeys("Phursungi").build().perform();//press down arrow key

Actions TalukDetails1= new Actions(driver);

TalukDetails1.sendKeys(Keys.ENTER).build().perform();//press enter

//break;

Thread.sleep(4000);

driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_ucMPAddress_btnAddress']")).click();

//}

Thread.sleep(3000);

//driver.findElement(By.xpath("//body/div[3]"));

//driver.switchTo().defaultContent();

WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));

if (element2.isDisplayed() && element2.isEnabled()) {

element2.click();

}

driver.findElement(By.id("ContentPlaceHolderBody_btnSaveAddress")).click();

Thread.sleep(3000);

//Access definition

// driver.findElement(By.cssSelector("div.container-fluid.pad-top-300.mar-bot-40:nth-child(10) div.container.all-outer-bg div.row div.col-sm-12.col-md-12.col-lg-8.pad-lf-ri-30.order-lg-1.order-2.scrollable.bor-rig-bg:nth-child(2) div.tab-style div.row.col-row-bg:nth-child(2) div.col-sm-12.col-md-12.col-lg-9.no-padding:nth-child(2) div.tab-content div.tab-pane.fade.active div.row:nth-child(3) div.row-pad div.col-12.col-sm-12.col-md-12.col-lg-12.column-center:nth-child(2) div.all-sub-bg > div.row.all-sub-pad")).click();

// driver.findElement(By.xpath("//input[@id='ContentPlaceHolderBody_txtRole']")).sendKeys("Sales");

// Servicing Details

Thread.sleep(2000);

driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolderBody$txtMarketing']")).sendKeys("33");

Thread.sleep(3000);

List <WebElement> autos = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));

int count = autos.size();

autos.get(count-1).click();

Thread.sleep(3000);

WebElement Intermediary = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]/span[1]/span[1]/span[1]"));

Actions actions11 = new Actions(driver); actions11.moveToElement(Intermediary).click().build().perform();

//for(int i = 0; i <= 2; i++)

//{

Actions IntermediaryDetails = new Actions(driver);

IntermediaryDetails.sendKeys("ASEGO INSURANCE LLP - 5109884").build().perform();//press down arrow key

Actions IntermediaryDetails1= new Actions(driver);

IntermediaryDetails1.sendKeys(Keys.ENTER).build().perform();//press enter

Thread.sleep(3000);

WebElement SalesBranch = driver.findElement(By.id("select2-ContentPlaceHolderBody_ddlSalesBranch-container"));

Actions actions12 = new Actions(driver); actions12.moveToElement(SalesBranch).click().build().perform();

for(int i = 0; i <= 0; i++) {

Actions SalesBranchDetails = new Actions(driver);

SalesBranchDetails.sendKeys("Mumbai - Thane").build().perform();//press down arrow key

Actions SalesBranchDetails1= new Actions(driver);

SalesBranchDetails1.sendKeys(Keys.ENTER).build().perform();//press enter

}

driver.findElement(By.xpath("//textarea[@name='ctl00$ContentPlaceHolderBody$txtRemarks']")).sendKeys("Automation Maker script");

driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolderBody$btnSave']")).click();

Thread.sleep(4000);

WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));

if (element4.isDisplayed() && element4.isEnabled()) {

element4.click();

}

Thread.sleep(3000);

}}

// driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolderBody$btnSaveAccess']")).click();

// driver.findElement(By.xpath(" //input[@name='ctl00$ContentPlaceHolderBody$btnPreviousServicing']")).click();

//driver.findElement(By.xpath(" //div[@class='row all-sub-pad']")).click();

//driver.findElement(By.xpath(" //input[@name='ctl00$ContentPlaceHolderBody$txtRole']")).sendKeys("Manager");

// driver.findElement(By.xpath(" //input[@value='Add Role']")).click();

// Thread.sleep(4000);

// WebElement element5 = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));

// if (element5.isDisplayed() && element5.isEnabled()) {

// element5.click();

// }

// driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolderBody$btnSaveAccess']")).click();

