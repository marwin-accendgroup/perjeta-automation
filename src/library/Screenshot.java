package library;

import java.io.File;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class Screenshot {
	public static void fullscreen(WebDriver driver, String mode, String screenshotName) throws InterruptedException{
		Thread.sleep(1000);
		
		
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500)
		.withName(screenshotName)
		.save(Paths.get(".").toAbsolutePath().normalize().toString() +"//Screenshots//" + mode + "//");
		System.out.println("Screenshot Done on " + mode +screenshotName);	
	}
	public static void visible(WebDriver driver, String mode, String screenshotName){
		try {
			Thread.sleep(1000);
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("Screenshots/" + mode + "/" + screenshotName+".png")); 
			System.out.println("Screenshot Done on " + mode + screenshotName);	
		} 
		catch (Exception e) {
			System.out.println("Exception while taking visible part screenshot" + e.getMessage());
		}
	}
	
}