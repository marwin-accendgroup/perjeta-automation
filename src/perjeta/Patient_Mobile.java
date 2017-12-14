package perjeta;

import java.util.HashMap;
import java.util.Map;

import library.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Patient_Mobile {

	public static void main() throws InterruptedException{
		Map<String, Object> mobile = new HashMap<>();
		mobile.put("width", 320);
		mobile.put("height",980);
		mobile.put("pixelRatio", 1.0);

		Map<String, Object> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceMetrics", mobile);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		chromeOptions.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(chromeOptions);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer.html");
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-home");
//		
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/div[1]/a[2]")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-navigation");
//		
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav/div/div[2]/div/ul/li[1]/a/i")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-hover-1.0");
//		
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav/div/div[2]/div/ul/li[2]/a/i")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-hover-2.0");
//		
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav/div/div[2]/div/ul/li[3]/a/i")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-hover-3.0");
//		
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav/div/div[2]/div/ul/li[4]/a/i")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-hover-4.0");
//		
//		driver.findElement(By.linkText("For US Healthcare Professionals")).click();
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-modal-HCP");
//		
//		driver.navigate().refresh();
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
//		jse.executeScript("window.scrollTo(0, 0)");
//		Screenshot.visible(driver, "mobile", "perjeta-mobile-modal-thirdpartysite");
//			
//		driver.navigate().refresh();
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-0.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/about.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-1.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/about/HER2-positive-breast-cancer.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-1.1");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/about/targeted-treatment.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-1.2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/about/perjeta.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-1.3");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/early.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-2.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/early/treatment-before-surgery.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-2.1");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/early/how-treatment-is-given.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-2.2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/early/why-perjeta.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-2.3");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/early/talking-with-your-doctor.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-2.4");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/metastatic.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-3.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/metastatic/how-treatment-is-given.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-3.1");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/metastatic/why-perjeta.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-3.2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/metastatic/talking-with-your-team.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-3.3");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources/4HER-patient-support-app.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.1");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources/financial-resources.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-pat1");
//		
//		driver.findElement(By.className("start-over")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-pat2");
//		
//		driver.findElement(By.className("start-over")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-pat3");
//		
//		driver.findElement(By.className("start-over")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[1]/a")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-pat-q1");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]"))).build().perform();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[3]/div[1]/a")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-pat-q2");
//		driver.manage().window().maximize();
//		
//		driver.navigate().refresh();
//		remove(driver);
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[1]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab1");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab2");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[3]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab3");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[4]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab4");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[5]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab5");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div[2]/div/section[6]/header/h1")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.2-tab6");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources/herconnection.html");
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.3");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[6]/form/div[2]/ol/li[1]/input")).click();
////		driver.findElement(By.cssSelector("body > main > section.gene-template__content.gene-template__content--main.gene-template__container > div.gene-template__form-main.gene-template__column.gene-template__column--primary > div.gene-template__authoring.gene-template__container.gene-template__container--form-intro > div.perjeta-patient-reg-form.section > form > div.field.required.perjeta-personal-description > ol > li:nth-child(1) > input[type='radio']")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.3-earlystage");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[6]/form/div[2]/ol/li[2]/input")).click();
////		driver.findElement(By.cssSelector("body > main > section.gene-template__content.gene-template__content--main.gene-template__container > div.gene-template__form-main.gene-template__column.gene-template__column--primary > div.gene-template__authoring.gene-template__container.gene-template__container--form-intro > div.perjeta-patient-reg-form.section > form > div.field.required.perjeta-personal-description > ol > li:nth-child(2) > input[type='radio']")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.3-metastatic");
//		
//		driver.findElement(By.name("first-name")).sendKeys("marwin");
//		driver.findElement(By.name("last-name")).sendKeys("nicolas");
//		driver.findElement(By.name("email-address")).sendKeys("marwin@accendgroup.com");
//		driver.findElement(By.name("confirm-email-address")).sendKeys("marwin@accendgroup.com");
//		driver.findElement(By.name("address-line-1")).sendKeys("CA");
//		driver.findElement(By.name("address-line-2")).sendKeys("CA");
//		driver.findElement(By.name("city")).sendKeys("CA");
////		driver.findElement(By.className("gene-component--dropdown")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[6]/form/div[7]/div[2]/div[1]/div/div")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[6]/form/div[7]/div[2]/div[1]/div/ul/li[1]")).click();
////		driver.findElement(By.cssSelector("body > main > section.gene-template__content.gene-template__content--main.gene-template__container > div.gene-template__form-main.gene-template__column.gene-template__column--primary > div.gene-template__authoring.gene-template__container.gene-template__container--form-intro > div.perjeta-patient-reg-form.section > form > div:nth-child(9) > div.state-zip-container > div.field.required.state.invalid > div > ul > li:nth-child(1)")).click();
//		driver.findElement(By.name("zip-code-base")).sendKeys("95126");
//		driver.findElement(By.name("primary-phone-number")).sendKeys("4084069201");
//		driver.findElement(By.name("verify-age")).click();
//		driver.findElement(By.className("submit")).click();
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.3-submit");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources/support-groups.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.4");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/support-resources/download.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-4.5");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/site-map.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-sitemap");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/glossary.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-glossary");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/patient/breast-cancer/safety.html");
//		Screenshot.fullscreen(driver, "mobile", "perjeta-mobile-safety");
		
		driver.quit();
	}
	public static void remove(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.className("gene-component--spotlight"));
		js.executeScript("arguments[0].setAttribute('style', 'height:0%;')",element);
	}
}
