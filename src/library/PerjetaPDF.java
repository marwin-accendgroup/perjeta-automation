package library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class PerjetaPDF {
	public static final String[] IMAGES = {
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-5.0.png",
		
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-mobile-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-mobile-navigation.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-mobile-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/patient-mobile-0.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-home.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-navigation.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-thirdpartysite.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-1.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-2.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-3.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-4.0.png",
		"C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/Patient_HCP/HCP-mobile-5.0.png",
	};
	
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/perjeta-automation/perjeta/Screenshots/perjeta.pdf";
	
	public static void main() throws MalformedURLException, IOException, DocumentException{
       File file = new File(DEST);
       file.getParentFile().mkdirs();
       new PerjetaPDF().createPdf(DEST);
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

