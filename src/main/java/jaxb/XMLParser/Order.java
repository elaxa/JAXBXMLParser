package jaxb.XMLParser;


import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(namespace="OrderRelease")
public class Order {
	private String sellerOrganizationCode;
	private int orderNo;
	private String enterprizeCode;
	private String documentType;


	
	
	public Order() {}
    public Order(String sellerOrganizationCode,int orderNo,String enterprizeCode,String documentType){
	this.sellerOrganizationCode=sellerOrganizationCode;
	this.orderNo=orderNo;
	this.enterprizeCode=enterprizeCode;
	this.documentType=documentType;
}
@XmlAttribute(name="SellerOrganizationCode")
String getSellerOrganizationCode(){
	return sellerOrganizationCode;
}
	
void setSellerOrganizationCode(String sellerOrganizationCode){
	this.sellerOrganizationCode=sellerOrganizationCode;
}


@XmlAttribute(name="OrderNo")
int getOrderNo(){
	return orderNo;
}
void setOrderNo(int orderNO){
	this.orderNo=orderNO;
}


@XmlAttribute(name="EnterpriseCode")
String getEnterprizeCode(){
	return enterprizeCode;
}

void setEnterprizeCode(String enterprizeCode){
	this.enterprizeCode=enterprizeCode;
}

@XmlAttribute(name="DocumentType")
String getDocumentType(){
	return documentType;
}
void setDocumentType(String documentType){
	this.documentType=documentType;
}
}










