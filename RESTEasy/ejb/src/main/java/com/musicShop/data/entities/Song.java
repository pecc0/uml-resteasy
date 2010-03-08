package com.musicShop.data.entities;

public class Song {
	public String name;
	public float[] duration;
	public Album album;
	public Group group;

	public void setName(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void setDuration(float[] aDuration) {
		this.duration = aDuration;
	}

	public float[] getDuration() {
		return this.duration;
	}
}