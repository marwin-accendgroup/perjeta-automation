package perjeta;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.DocumentException;

import library.HCPPDF;
import library.PatientPDF;
import library.PerjetaPDF;

public class Perjeta {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException, DocumentException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32-v2.33\\chromedriver.exe");
		
//		Patient.main();
//		Patient_Mobile.main();
//		HCP.main();
//		HCP_mobile.main();
//		Patient_HCP.desktop();
//		Patient_HCP.mobile();
		
//		PerjetaPDF.main();
		HCPPDF.main();
//		PatientPDF.main();
	}
}
