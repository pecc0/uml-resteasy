package com.musicShop.forms;

public class GroupForm {
	@javax.ws.rs.FormParam(value = "name")
	private String name;
	@javax.ws.rs.FormParam(value = "fromDate")
	private String fromDate;
	@javax.ws.rs.FormParam(value = "toDate")
	private String toDate;
	@javax.ws.rs.FormParam(value = "pass")
	private String musitions;

	public String toString() {
		return "Group\nname: " + name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void setFromDate(String aFromDate) {
		this.fromDate = aFromDate;
	}

	public String getFromDate() {
		return this.fromDate;
	}

	public void setToDate(String aToDate) {
		this.toDate = aToDate;
	}

	public String getToDate() {
		return this.toDate;
	}

	public void setMusitions(String aMusitions) {
		this.musitions = aMusitions;
	}

	public String getMusitions() {
		return this.musitions;
	}
}