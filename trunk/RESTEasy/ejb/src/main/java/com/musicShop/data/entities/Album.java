package com.musicShop.data.entities;

import java.util.ArrayList;
import com.musicShop.data.entities.Song;

@javax.xml.bind.annotation.XmlRootElement
public class Album {
	@javax.ws.rs.FormParam(value = "style")
	private String style = "";
	private int year;
	@javax.ws.rs.FormParam(value = "name")
	private String name = "";
	public ArrayList<Song> songs = new ArrayList<Song>();

	@javax.ws.rs.FormParam(value = "year")
	public void setYear(String aValue) {
		try {
					year = Integer.valueOf(aValue);
				} catch (NumberFormatException e) {
					year = -1;
					System.out.println("bad year " + aValue);
				}
	}

	public String toString() {
		return "Album (" + name + ", " + style + ", " + year + ")";
	}

	public void setStyle(String aStyle) {
		this.style = aStyle;
	}

	public String getStyle() {
		return this.style;
	}

	public void setYear(int aYear) {
		this.year = aYear;
	}

	public int getYear() {
		return this.year;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}
}