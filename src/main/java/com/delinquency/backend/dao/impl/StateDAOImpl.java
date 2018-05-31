package com.delinquency.backend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.delinquency.backend.dao.StateDAO;
import com.delinquency.backend.entity.State;

@Repository
public class StateDAOImpl implements StateDAO{ 

	@Override
	public List<State> getState() {
		
		List<State> list = new ArrayList<>();
		list.add(new State(1, "Baja California", 1223));
		list.add(new State(2, "Chihuahua", 2343));
		list.add(new State(3, "Sonora", 2662));
		list.add(new State(4, "Veracruz", 7643));
		
		return list;
	}
}
