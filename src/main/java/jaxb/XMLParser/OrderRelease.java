package jaxb.XMLParser;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OrderRelease")
public class OrderRelease {
	//Attribute
	private String isReleaseAcknowledge;
    private int ReleaseNo;
    private ArrayList<Order> orderList;
	private ArrayList<OrderLine> orderLineList;

    
    public OrderRelease() {
	}
    OrderRelease(String isReleaseAcknowledge,int ReleaseNo){
    	this.isReleaseAcknowledge=isReleaseAcknowledge;
    	this.ReleaseNo=ReleaseNo;
    }
   
    @XmlAttribute(name="isReleaseAcknowledged")
    String getReleaseAcknowledge(){
    	return isReleaseAcknowledge;
    	
    }
    void setReleaseAcknowledge(String isReleaseAcknowledge){
    	this.isReleaseAcknowledge=isReleaseAcknowledge;
    }
    
    @XmlAttribute(name="ReleaseNo")
    int getReleaseNo(){
    	return ReleaseNo;
    }
    void setReleaseNo(int ReleaseNo){
    	this.ReleaseNo=ReleaseNo;
    }
	@XmlElement(name="Order")
	ArrayList<Order> getOrder(){
		return orderList;
	}
	void setOrder(ArrayList<Order> orderList){
		this.orderList=orderList;
	}
	
	@XmlElement(name="OrderLine")
	ArrayList<OrderLine> getOrderLineList(){
		return orderLineList;
	}

	void setOrderLineList(ArrayList<OrderLine> orderLineList){
		this.orderLineList=orderLineList;
	}
	

}
