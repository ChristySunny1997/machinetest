package com.faith.springboot.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RequestTable {
	
	
	
	//instance variables
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestId;
	private String causeTravel;
	private String source;
	private String destination;
	private String mode;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int noOfDays;
	private String priority;
	private int projectId;
	private Integer empId;
	private String status;
	
	@JoinColumn(name="projectId",insertable=false,updatable=false)
	@ManyToOne
	private ProjectTable projectTable;
	
	@JoinColumn(name="empId",insertable=false,updatable=false)
	@ManyToOne
	private Employee employee;
	
	//default constructor
	public RequestTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterilised constructor
	public RequestTable(int requestId, String causeTravel, String source, String destination, String mode,
			LocalDate fromDate, LocalDate toDate, int noOfDays, String priority, int projectId, Integer empId,
			String status) {
		super();
		this.requestId = requestId;
		this.causeTravel = causeTravel;
		this.source = source;
		this.destination = destination;
		this.mode = mode;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfDays = noOfDays;
		this.priority = priority;
		this.projectId = projectId;
		this.empId = empId;
		this.status = status;
	}
	


	//getters and setters
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getCauseTravel() {
		return causeTravel;
	}

	public void setCauseTravel(String causeTravel) {
		this.causeTravel = causeTravel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
//to string function
	@Override
	public String toString() {
		return "RequestTable [requestId=" + requestId + ", causeTravel=" + causeTravel + ", source=" + source
				+ ", destination=" + destination + ", mode=" + mode + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", noOfDays=" + noOfDays + ", priority=" + priority + ", projectId=" + projectId + ", empId=" + empId
				+ ", status=" + status + "]";
	}
	
	
	
	
	

}
