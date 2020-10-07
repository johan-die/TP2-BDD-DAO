package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "ORDERS")
public class Orders {
 
    @Id
    @Column(name = "ORD_NUM", nullable = false)
    private Integer orderNum;
    @Column(name = "ORD_AMOUNT",precision = 2, nullable = false)
    private Float orderAmount;
    @Column(name = "ADVANCE_AMOUNT",precision = 2, nullable = false)
    private Float advanceAmount;

 
    @Temporal(TemporalType.DATE)
    @Column(name = "ORD_DATE", nullable = false)
    private Date orderDate;
    @Column(name = "CUST_CODE", length = 6, nullable = false)
    private String customerCode;
    @Column(name = "AGENT_CODE", length = 6, nullable = false)
    private String agentCode;
    @Column(name = "ORD_DESCRIPTION", length = 60, nullable = false)
    private String description;
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Float getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Float orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Float getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(Float advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
}