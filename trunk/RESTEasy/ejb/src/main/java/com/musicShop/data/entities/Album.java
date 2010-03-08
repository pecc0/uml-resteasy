package com.musicShop.data.entities;

import java.util.ArrayList;
import com.musicShop.data.entities.Song;

public class Album {
	public String style;
	public int[] year;
	public ArrayList<Song> songs = new ArrayList<Song>();

	public void setStyle(String aStyle) {
		this.style = aStyle;
	}

	public String getStyle() {
		return this.style;
	}

	public void setYear(int[] aYear) {
		this.year = aYear;
	}

	public int[] getYear() {
		return this.year;
	}
}