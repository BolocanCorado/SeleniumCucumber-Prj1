package utils;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLParser {
    public static String extractTotalAmount(String fileName, String elementName) {
        try {
            // Load the XML file
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Get the root element
            Element rootElement = doc.getDocumentElement();

            // Find the GrpHdr element
            NodeList grpHdrList = rootElement.getElementsByTagName("GrpHdr");
            if (grpHdrList.getLength() > 0) {
                Element grpHdr = (Element) grpHdrList.item(0);
                
                // Find the CtrlSum element under GrpHdr
                NodeList CtrlSumList = grpHdr.getElementsByTagName("CtrlSum");
                if (CtrlSumList.getLength() > 0) {
                    Element CtrlSumElement = (Element) CtrlSumList.item(0);
                    
                    // Extract and return the content of MsgId element
                    return CtrlSumElement.getTextContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Return null if element not found
    }
    public static String extractAccountAmount(String fileName, String accountName) {
        try {
            // Load the XML file
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Get the root element
            Element rootElement = doc.getDocumentElement();

            // Find the PmtInf element
            NodeList PmtInfList = rootElement.getElementsByTagName("PmtInf");
            if (PmtInfList.getLength() > 0) {
                Element PmtInf = (Element) PmtInfList.item(0);
                
                // Find the Cdtr element under PmtInf
                NodeList CdtrList = PmtInf.getElementsByTagName("Cdtr");
                if (CdtrList.getLength() > 0) {
                    Element CdtrListAcElem = (Element) CdtrList.item(0);
                    String CdtrListAcName = CdtrListAcElem.getTextContent();
                    if (CdtrListAcName == accountName) {
                    	NodeList AmtList = PmtInf.getElementsByTagName("Amt");
                    	if (AmtList.getLength() > 0) {
                            Element AmtElem = (Element) AmtList.item(0);
                         // Extract and return the content of MsgId element
                            return AmtElem.getTextContent();
                    }
                    
                }
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Return null if element not found
    }
}
