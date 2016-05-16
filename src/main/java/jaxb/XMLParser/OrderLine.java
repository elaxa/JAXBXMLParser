
package jaxb.XMLParser;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;



@XmlRootElement(namespace="OrderRelease")

class OrderLine{

	
	@XmlAttribute(name="SubLineNo")
	private int subLineNo;
	int getSubLineNo(){
		return subLineNo;
	}
	void setSubLineNo(int subLineNo){
		this.subLineNo=subLineNo;
	}
	
	@XmlAttribute(name="PrimeLineNo")
	private int primeLineNo;

	int getPrimeLineNo(){
		return primeLineNo;
	}
	void setPrimeAttribute(int primeLineNo){
		this.primeLineNo=primeLineNo;
	}
	
	@XmlElement(name="Extn")
	private Extn extn=new Extn();
	Extn getExtn(){
		return extn;
	}
	void setExtn(Extn extn){
		this.extn=extn;
	}
	
}


@XmlAccessorType(XmlAccessType.FIELD)
class Extn{
	
	@XmlValue
	private boolean extn;
	boolean getExtnValue(){
		return extn;
	}
	void setExtnValue(boolean extn){
		this.extn=extn;
	}
	
	@XmlAttribute(name="ExtnDeliveryNo")
	
	private int extnDeliveryNo;
	int getExtnDeliveryNo(){
		return extnDeliveryNo;
	}
	void setExtnDeliveryNo(int extnDeliveryNo){
		this.extnDeliveryNo=extnDeliveryNo;
	}
	
}



