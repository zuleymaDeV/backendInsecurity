package com.delinquency.backend.entity;

public class Delinquency {
	
	private int idDelinquency;
	private String nameDelinquency;
	public int getIdDelinquency() {
		return idDelinquency;
	}
	public void setIdDelinquency(int idDelinquency) {
		this.idDelinquency = idDelinquency;
	}
	public String getNameDelinquency() {
		return nameDelinquency;
	}
	public void setNameDelinquency(String nameDelinquency) {
		this.nameDelinquency = nameDelinquency;
	}
	public Delinquency(int idDelinquency, String nameDelinquency) {
		this.idDelinquency = idDelinquency;
		this.nameDelinquency = nameDelinquency;
	}

}
