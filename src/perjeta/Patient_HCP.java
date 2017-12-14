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

public class Patient_HCP {
	public static void desktop() throws InterruptedException{
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
		
		driver.get("http://localhost:4503/content/perjeta/en_us/patient.html");
		Screenshot.visible(driver, "Patient_HCP", "patient-home");
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Screenshot.visible(driver, "Patient_HCP", "patient-thirdpartysite");
		
		driver.navigate().refresh();
		remove(driver);
		Screenshot.fullscreen(driver, "Patient_HCP", "patient-0.0");
		
		driver.get("http://localhost:4503/content/perjeta/en_us/hcp.html");
		driver.get("http://localhost:4503/content/perjeta/en_us/hcp.html");
		Screenshot.visible(driver, "Patient_HCP", "HCP-home");
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Screenshot.visible(driver, "Patient_HCP", "HCP-thirdpartysite");
		
		driver.navigate().refresh();
		remove(driver);
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-1.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[2]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-2.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[3]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-3.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[4]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-4.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[5]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-5.0");
		
		driver.quit();
		
	}
	public static void mobile() throws InterruptedException{
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
		driver.manage().window().maximize();
		
		driver.get("http://localhost:4503/content/perjeta/en_us/patient.html");
		Screenshot.visible(driver, "Patient_HCP", "patient-mobile-home");
		
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/div[1]/a[2]/i[1]")).click();
		Screenshot.visible(driver, "Patient_HCP", "patient-mobile-navigation");
		
		driver.navigate().refresh();
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Screenshot.visible(driver, "Patient_HCP", "patient-mobile-thirdpartysite");
		
		driver.navigate().refresh();
		remove(driver);
		Screenshot.fullscreen(driver, "Patient_HCP", "patient-mobile-0.0");
		
		driver.get("http://localhost:4503/content/perjeta/en_us/hcp.html");
		driver.get("http://localhost:4503/content/perjeta/en_us/hcp.html");
		Screenshot.visible(driver, "Patient_HCP", "HCP-mobile-home");
		
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/div[1]/a[2]/i[1]")).click();
		Screenshot.visible(driver, "Patient_HCP", "HCP-mobile-navigation");
		
		driver.navigate().refresh();
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("www.fda.gov/medwatch")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Screenshot.visible(driver, "Patient_HCP", "HCP-mobile-thirdpartysite");
		
		driver.navigate().refresh();
		remove(driver);
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-mobile-1.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[2]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-mobile-2.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[3]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-mobile-3.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[4]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-mobile-4.0");
		
		driver.findElement(By.xpath("/html/body/main/section[3]/div[1]/div[2]/div/section[5]/header/h1")).click();
		Screenshot.fullscreen(driver, "Patient_HCP", "HCP-mobile-5.0");
		
		driver.quit();
		
	}
	public static void remove(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.className("gene-component--spotlight"));
		js.executeScript("arguments[0].setAttribute('style', 'height:0%;')",element);
	}
}
