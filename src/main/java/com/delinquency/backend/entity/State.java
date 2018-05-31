package com.delinquency.backend.entity;

public class State {

	
	private int idState;
	private String name;
	private int population;
	
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public State(int idState, String name, int population) {

		this.idState = idState;
		this.name = name;
		this.population = population;
	}
}
