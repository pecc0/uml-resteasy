package com.musicShop.frontEnd;

import com.musicShop.data.xml.EmployeeListing;

@javax.ws.rs.Path(value = "employees")
public interface EmployeesWebService {

	@javax.ws.rs.GET
	@javax.ws.rs.Produces(value = "application/json")
	@javax.ws.rs.Path(value = "list")
	public EmployeeListing getList();
}