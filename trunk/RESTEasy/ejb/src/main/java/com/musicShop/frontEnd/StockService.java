package com.musicShop.frontEnd;

import org.jboss.resteasy.annotations.Form;

import com.musicShop.data.xml.AlbumListing;
import com.musicShop.forms.StockForm;

@javax.ws.rs.Path(value = "albums")
public interface StockService {

	@javax.ws.rs.GET
	@javax.ws.rs.Produces(value = "application/json")
	@javax.ws.rs.Path(value = "list")
	public AlbumListing getList();

	@javax.ws.rs.POST
	@javax.ws.rs.Path(value = "add")
	public void addStock(@Form StockForm aAlbum);
}