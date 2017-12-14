package library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class HCPPDF {
	public static final String[] IMAGES = {
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-hover-6.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-modal-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-2.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-2.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-3.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-3.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-4.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-4.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-5.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-5.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-part3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat1-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat1-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat2-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat2-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat3-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-pat3-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-q1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-tab3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-tab4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.1-tab5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-6.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-contact-rep.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-contact-rep-provider.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-contact-rep-specialty.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-contact-rep-signup.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-register.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-register-classification.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-register-specialty.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-register-submit.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-safety.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-sitemap.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop-hcp/perjeta-hcp-references.png",
		
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-navigation.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-hover-6.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-modal-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-2.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-2.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-3.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-3.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-4.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-4.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-5.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-5.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-pat1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-pat2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-pat3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-q1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-tab3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-tab4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.1-tab5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-6.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-contact-rep.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-contact-rep-provider.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-contact-rep-specialty.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-contact-rep-signup.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-register.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-register-classification.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-register-specialty.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-register-submit.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-safety.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-sitemap.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile-hcp/perjeta-hcp-mobile-references.png"
		
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/HCP.pdf";
	
	public static void main() throws MalformedURLException, IOException, DocumentException{
       File file = new File(DEST);
       file.getParentFile().mkdirs();
       new HCPPDF().createPdf(DEST);
	}
	public void createPdf(String dest) throws MalformedURLException, IOException, DocumentException{
	        Image img = Image.getInstance(IMAGES[0]);
	        Document document = new Document(img);
	        PdfWriter.getInstance(document, new FileOutputStream(dest));
	        
	        document.open();
	        for (String image : IMAGES) {
	            img = Image.getInstance(image);
	            if(img.getHeight() > 14400){
	            	img.scaleToFit(320, 14400);
	            }
	            else{
	            	document.setPageSize(img);
	            }
	            document.newPage();
	            img.setAbsolutePosition(0, 0);

	            document.add(img);
	        }
	        
	        document.close();
	    }
}


