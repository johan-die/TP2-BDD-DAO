package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "CUSTOMER")
public class Customer {
 
    @Id
    @Column(name = "CUST_CODE", length = 6, nullable = false)
    private String customerCode;
 
    @Column(name = "CUST_NAME", length = 40, nullable = false)
    private String name;
    @Column(name = "CUST_CITY", length = 40, nullable = false)
    private String city;
    @Column(name = "WORKING_AREA", length = 35, nullable = false)
    private String workingArea;
    @Column(name = "CUST_COUNTRY", length = 25, nullable = false)
    private String country;
    @Column(name = "GRADE", nullable = true)
    private Integer grade;

    @Column(name = "OPENING_AMT",precision = 2, nullable = false)
    private Float openingAtm;
    @Column(name = "RECEIVE_AMT",precision = 2, nullable = false)
    private Float recieveAtm;
    @Column(name = "PAYMENT_AMT",precision = 2, nullable = false)
    private Float paymentAtm;
    @Column(name = "OUTSTANDING_AMT",precision = 2, nullable = false)
    private Float outstandingAtm;
    @Column(name = "PHONE_NO", length = 15, nullable = true)
    private String phoneNumber;

    @Column(name = "AGENT_CODE", length = 6, nullable = false)
    private String agentCode;
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWorkingArea() {
		return workingArea;
	}
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Float getOpeningAtm() {
		return openingAtm;
	}
	public void setOpeningAtm(Float openingAtm) {
		this.openingAtm = openingAtm;
	}
	public Float getRecieveAtm() {
		return recieveAtm;
	}
	public void setRecieveAtm(Float recieveAtm) {
		this.recieveAtm = recieveAtm;
	}
	public Float getPaymentAtm() {
		return paymentAtm;
	}
	public void setPaymentAtm(Float paymentAtm) {
		this.paymentAtm = paymentAtm;
	}
	public Float getOutstandingAtm() {
		return outstandingAtm;
	}
	public void setOutstandingAtm(Float outstandingAtm) {
		this.outstandingAtm = outstandingAtm;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}


}