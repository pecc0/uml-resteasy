package com.musicShop.data.entities;

public class Supplier {
	public String address;
	public long[] telephone;
	public String firmName;
	public long[] MOL;
	public String[] bulstat;
	public String ownerName;

	public void setAddress(String aAddress) {
		this.address = aAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setTelephone(long[] aTelephone) {
		this.telephone = aTelephone;
	}

	public long[] getTelephone() {
		return this.telephone;
	}

	public void setFirmName(String aFirmName) {
		this.firmName = aFirmName;
	}

	public String getFirmName() {
		return this.firmName;
	}

	public void setMOL(long[] aMOL) {
		this.MOL = aMOL;
	}

	public long[] getMOL() {
		return this.MOL;
	}

	public void setBulstat(String[] aBulstat) {
		this.bulstat = aBulstat;
	}

	public String[] getBulstat() {
		return this.bulstat;
	}

	public void setOwnerName(String aOwnerName) {
		this.ownerName = aOwnerName;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
}