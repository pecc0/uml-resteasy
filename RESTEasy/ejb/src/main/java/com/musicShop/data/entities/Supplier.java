package com.musicShop.data.entities;

@javax.xml.bind.annotation.XmlRootElement
public class Supplier {
	private String address = "";
	private long telephone;
	private String firmName = "";
	private long MOL;
	private String bulstat = "";
	private String ownerName = "";

	public void setAddress(String aAddress) {
		this.address = aAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setTelephone(long aTelephone) {
		this.telephone = aTelephone;
	}

	public long getTelephone() {
		return this.telephone;
	}

	public void setFirmName(String aFirmName) {
		this.firmName = aFirmName;
	}

	public String getFirmName() {
		return this.firmName;
	}

	public void setMOL(long aMOL) {
		this.MOL = aMOL;
	}

	public long getMOL() {
		return this.MOL;
	}

	public void setBulstat(String aBulstat) {
		this.bulstat = aBulstat;
	}

	public String getBulstat() {
		return this.bulstat;
	}

	public void setOwnerName(String aOwnerName) {
		this.ownerName = aOwnerName;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
}