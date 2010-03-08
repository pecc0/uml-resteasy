package com.musicShop.frontEnd;

import com.musicShop.data.xml.SuppliersListing;

@javax.ws.rs.Path(value = "suppliers")
public interface SuppliersWebService {

	@javax.ws.rs.GET
	@javax.ws.rs.Produces(value = "application/json")
	@javax.ws.rs.Path(value = "list")
	public SuppliersListing getList();
}