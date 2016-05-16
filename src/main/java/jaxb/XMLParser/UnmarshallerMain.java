package jaxb.XMLParser;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.XMLParser.OrderRelease;

public class UnmarshallerMain{

public static void main(String args[]) {
	
	try {    
        File file = new File("/root/JAXB/XMLParser/TestRespoonse.xml");    
        JAXBContext jaxbContext = JAXBContext.newInstance(OrderRelease.class);    
     
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
        OrderRelease x=(OrderRelease) jaxbUnmarshaller.unmarshal(file);    
        System.out.println("Attribute of OrderRelease:\n");
        System.out.println("Release NO:"+x.getReleaseNo()+","+"isAknowledge:"+x.getReleaseAcknowledge());
        
        
        //Fetching attribute of Order
        System.out.println("Attribute of order:\n");
        ArrayList<Order> orderList=x.getOrder();
        for(Order o:orderList){
        	System.out.println("SellerOrganizationCode"+o.getSellerOrganizationCode()+", OrderNo:"+o.getOrderNo()+",EnterPrizeCode:"+o.getEnterprizeCode()+",DocumentType:"+o.getDocumentType());
      
        }
        
        System.out.println("OrderLine attribute:");
        ArrayList<OrderLine> orderLineList=x.getOrderLineList();
        for(OrderLine ol:orderLineList){
      	  System.out.println("PrimeLineNo:"+ol.getPrimeLineNo()+" ,SubLineNo:"+ol.getSubLineNo());
      	  Extn extn=ol.getExtn();
      	  
      	  System.out.println("Extn attribute & value:\n");
      	  System.out.println("Extn Value:"+extn.getExtnValue());
      	  System.out.println("Extn attribute value(ExtnDeliveryNo):"+extn.getExtnDeliveryNo());
      	  
      	  
        }
        
        
        
        
        
      } catch (JAXBException e) {e.printStackTrace(); }    
}
}