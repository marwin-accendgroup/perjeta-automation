package perjeta;

import java.util.HashMap;
import java.util.Map;

import library.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.unix.X11.Screen;

public class HCP {

	public static void main() throws InterruptedException{
		Map<String, Object> desktop = new HashMap<>();
		desktop.put("width", 1920);
		desktop.put("height", 980);
		desktop.put("pixelRatio", 1.0);

		Map<String, Object> desktopemulator = new HashMap<>();
		desktopemulator.put("deviceMetrics", desktop);
		desktopemulator.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer.html");
//		Screenshot.visible(driver, "desktop-hcp", "perjeta-hcp-home");
//		
//		action.moveToElement(driver.findElement(By.linkText("Resources"))).build().perform();
//		Screenshot.visible(driver, "desktop-hcp", "perjeta-hcp-hover-6.0");
//		
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
//		jse.executeScript("window.scrollTo(0, 0)");
//		Screenshot.visible(driver, "desktop-hcp", "perjeta-hcp-modal-thirdpartysite");
//		
//		driver.navigate().refresh();
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-0.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/about-perjeta.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-1.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/trial-designs.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-2.0-tab1");
//		
//		jse.executeScript("window.scrollTo(0, 0)");
//		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[3]/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-2.0-tab2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/efficacy.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-3.0-tab1");
//		
//		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[3]/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-3.0-tab2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/safety-profiles.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-4.0-tab1");
//		
//		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[3]/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-4.0-tab2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/dosing-admin.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-5.0-tab1");
//		
//		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[3]/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-5.0-tab2");
//		
		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/resources.html");
		remove(driver);
		jse.executeScript("window.scrollTo(0, 500)");
		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.0");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/resources/financial-assistance.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-part1");
//		
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]"))).build().perform();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-part2");
//		
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[5]/div[2]/fieldset/button[1]"))).build().perform();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-part3");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat1-part1");
//		
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[4]/div/p[6]"))).build().perform();
//		Thread.sleep(1000);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat1-part2");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[5]/div[2]/button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.className("more-info")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-q1");
//		
//		jse.executeScript("window.scrollTo(0, 500)");
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[2]")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat2-part1");
//		
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[3]/div/p[6]"))).build().perform();
//		Thread.sleep(1000);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat2-part2");
//		
//		driver.findElement(By.className("start-over")).click();
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollTo(0, 0)");
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[1]/ul/li[5]/div[2]/fieldset/button[1]")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat3-part1");
//		
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div[2]/div[2]/div/p[6]"))).build().perform();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-pat3-part2");
//		
//		driver.findElement(By.className("start-over")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div/section[1]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-tab1");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div/section[2]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-tab2");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div/section[3]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-tab3");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div/section[4]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-tab4");
//		
//		driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div/section[5]/header/h1")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.1-tab5");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/resources/downloads.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-6.2");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/contact.html");
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-contact-rep");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[3]/form/div[1]/div[1]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-contact-rep-provider");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[3]/form/div[1]/div[2]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-contact-rep-specialty");
		
		//manual submit
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/register.html");
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[1]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register-classification");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[2]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register-specialty");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[1]/div/div/div")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[1]/div/div/ul/li[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.name("first-name")).sendKeys("marwin");
//		driver.findElement(By.name("last-name")).sendKeys("nicolas");
//		driver.findElement(By.name("address-line-1")).sendKeys("CA");
//		driver.findElement(By.name("address-line-2")).sendKeys("CA");
//		driver.findElement(By.name("city")).sendKeys("CA");
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[4]/div[2]/div[1]/div/div")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[4]/div[2]/div[1]/div/ul/li[1]")).click();
//		driver.findElement(By.name("zip-code-base")).sendKeys("99501");
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[1]/div/div")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[1]/div/ul/li[1]")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[2]/div/div")).click();
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[2]/div/ul/li[1]")).click();
//		driver.findElement(By.name("email-address")).sendKeys("marwin@accendgroup.com");
//		driver.findElement(By.name("confirm_email-address")).sendKeys("marwin@accendgroup.com");
//		driver.findElement(By.className("submit")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register-submit");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[1]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register-classification");
//		
//		driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div[1]/div[4]/form/div[5]/div[2]/div/div")).click();
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-register-classification");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/isi.html");
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-safety");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/site-map.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-sitemap");
//		
//		driver.get("http://localhost:4503/content/perjeta/en_us/hcp/breast-cancer/references.html");
//		remove(driver);
//		Screenshot.fullscreen(driver, "desktop-hcp", "perjeta-hcp-references");
		
		driver.quit();
	}
	public static void remove(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.className("gene-component--spotlight"));
		js.executeScript("arguments[0].setAttribute('style', 'height:0%;')",element);
	}
}
	