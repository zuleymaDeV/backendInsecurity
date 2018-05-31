package com.delinquency.backend.entity;

public class Statistics {
	
	private int id;
	private int idState;
	private String  nameDel;
	private int prctDel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
	public String getNameDel() {
		return nameDel;
	}
	public void setNameDel(String nameDel) {
		this.nameDel = nameDel;
	}
	public int getPrctDel() {
		return prctDel;
	}
	public void setPrctDel(int prctDel) {
		this.prctDel = prctDel;
	}
	public Statistics(int id, int idState, String nameDel, int prctDel) {
		this.id = id;
		this.idState = idState;
		this.nameDel = nameDel;
		this.prctDel = prctDel;
	}
	
	
	
}
