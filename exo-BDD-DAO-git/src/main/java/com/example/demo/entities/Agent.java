package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "AGENTS")
public class Agent {
 
    @Id
    @Column(name = "AGENT_CODE", length = 6, nullable = false)
    private String agentCode;
 
    @Column(name = "AGENT_NAME", length = 40, nullable = true)
    private String agentName;
    @Column(name = "PHONE_NO", length = 15, nullable = true)
    private String phoneNumber;
    @Column(name = "WORKING_AREA", length = 35, nullable = true)
    private String workingArea;
    @Column(name = "COUNTRY", length = 25, nullable = true)
    private String country;
 
    @Column(name = "COMMISSION",precision = 2, nullable = true)
    private Float commission;

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}
}