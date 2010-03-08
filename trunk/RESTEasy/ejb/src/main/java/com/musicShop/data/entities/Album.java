package com.musicShop.data.entities;

import java.util.ArrayList;
import com.musicShop.data.entities.Song;

@javax.xml.bind.annotation.XmlRootElement
public class Album {
	private String style = "";
	private int year;
	private String name = "";
	public ArrayList<Song> songs = new ArrayList<Song>();

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