package com.cognixia.jump.models;

public class Exhibit {

	
	private int id;
	private String name;
	private String picture;
	private boolean open;
	
	
	
	
	public Exhibit(int id, String name, String picture, boolean open) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.open = open;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}


	@Override
	public String toString() {
		return "Exhibit [id=" + id + ", name=" + name + ", picture=" + picture + ", open=" + open + "]";
	}
	
	
	
	
}
