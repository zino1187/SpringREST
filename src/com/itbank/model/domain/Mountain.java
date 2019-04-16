package com.itbank.model.domain;

public class Mountain {
	private int mountaion_id;
	private String name;
	private String addr;
	private String detail;
	private double lati;
	private double longi;
	private String filename;
	private String marker;
	
	public int getMountaion_id() {
		return mountaion_id;
	}
	public void setMountaion_id(int mountaion_id) {
		this.mountaion_id = mountaion_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
	
	
}
