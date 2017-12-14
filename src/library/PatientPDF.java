package library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class PatientPDF {
	public static final String[] IMAGES = {
		
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-hover-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-hover-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-hover-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-hover-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-modal-share.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-modal-share-error.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-modal-share-submit.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-modal-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-modal-HCP.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-1.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-1.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-1.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-2.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-2.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-2.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-2.4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-3.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-3.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-3.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat1-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat1-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat2-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat2-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat3-part1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat3-part2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat-q1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-pat-q2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.2-tab6.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.3-earlystage.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.3-metastatic.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.3-submit.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-4.5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-sitemap.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-glossary.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/desktop/perjeta-safety.png",
		
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-navigation.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-hover-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-hover-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-hover-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-hover-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-modal-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-modal-HCP.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-1.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-1.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-1.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-2.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-2.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-2.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-2.4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-3.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-3.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-3.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-pat1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-pat2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-pat3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-pat-q1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-pat-q2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab1.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab2.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.2-tab6.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.3.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.3-earlystage.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.3-metastatic.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.3-submit.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.4.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-4.5.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-sitemap.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-glossary.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/mobile/perjeta-mobile-safety.png",
		
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/patient.pdf";
	
	public static void main() throws MalformedURLException, IOException, DocumentException{
       File file = new File(DEST);
       file.getParentFile().mkdirs();
       new PatientPDF().createPdf(DEST);
   }
	 public void createPdf(String dest) throws MalformedURLException, IOException, DocumentException{
	        Image img = Image.getInstance(IMAGES[0]);
	        Document document = new Document(img);
	        PdfWriter.getInstance(document, new FileOutputStream(dest));
	        
	        document.open();
	        for (String image : IMAGES) {
	            img = Image.getInstance(image);
	            if(img.getHeight() > 14400){
	            	img.scaleToFit(14400, 14400);
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

