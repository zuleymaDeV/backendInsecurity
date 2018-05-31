package com.delinquency.backend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.delinquency.backend.dao.DelinquencyDAO;
import com.delinquency.backend.entity.Delinquency;

@Repository
public class DelinquencyDAOImpl implements DelinquencyDAO{

	@Override
	public List<Delinquency> getDelinquency() {
		
		List<Delinquency> list = new ArrayList<>();
		list.add(new Delinquency(1,"cajero automatico"));
		list.add(new Delinquency(2,"Banco"));
		list.add(new Delinquency(4,"Escuela"));
		list.add(new Delinquency(5,"Calles"));
		list.add(new Delinquency(6,"Automovil"));

		return list;
	}

}
