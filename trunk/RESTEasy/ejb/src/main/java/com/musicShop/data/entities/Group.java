package com.musicShop.data.entities;

import java.util.ArrayList;
import com.musicShop.data.entities.Musition;
import com.musicShop.data.entities.Song;

public class Group {
	public String name;
	public int[] from_date;
	public int[] to_date;
	public String musition;
	public ArrayList<Musition> musitians = new ArrayList<Musition>();
	public ArrayList<Song> songs = new ArrayList<Song>();

	public void setName(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void setFrom_date(int[] aFrom_date) {
		this.from_date = aFrom_date;
	}

	public int[] getFrom_date() {
		return this.from_date;
	}

	public void setTo_date(int[] aTo_date) {
		this.to_date = aTo_date;
	}

	public int[] getTo_date() {
		return this.to_date;
	}

	public void setMusition(String aMusition) {
		this.musition = aMusition;
	}

	public String getMusition() {
		return this.musition;
	}
}