package com.musicShop.forms;

public class StockForm {
	@javax.ws.rs.FormParam(value = "name")
	private String albumName;
	@javax.ws.rs.FormParam(value = "style")
	private String style;
	@javax.ws.rs.FormParam(value = "year")
	private String year;

	public String toString() {
		return "\nname: " + albumName + "\nstyle: " + style;
	}

	public void setAlbumName(String aAlbumName) {
		this.albumName = aAlbumName;
	}

	public String getAlbumName() {
		return this.albumName;
	}

	public void setStyle(String aStyle) {
		this.style = aStyle;
	}

	public String getStyle() {
		return this.style;
	}

	public void setYear(String aYear) {
		this.year = aYear;
	}

	public String getYear() {
		return this.year;
	}
}