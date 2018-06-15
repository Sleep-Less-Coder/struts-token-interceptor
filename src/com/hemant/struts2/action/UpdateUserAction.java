package com.hemant.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("Update request arrived at UpdateUserAction action!");
		setUpdateTime(new Date());
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (getName().isEmpty()) {
			addActionError("Name cannot be empty");
		}
		if (getAddress().isEmpty()) {
			addActionError("Address cannot be empty");
		}
		super.validate();
	}

	// Java bean variables
	private String name;
	private String address;
	private Date updateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
