package com.delinquency.backend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.delinquency.backend.dao.StatisticsDAO;
import com.delinquency.backend.entity.Statistics;

@Repository
public class StatisticsDAOImpl implements StatisticsDAO {

	public List<Statistics> getStatistics() {
		
		List<Statistics> list = new  ArrayList<>();
		list.add(new Statistics(1,1, "cajero automatico",33));
		list.add(new Statistics(2,1, "Escuela",32));
		list.add(new Statistics(3,1, "Banco",44));
		list.add(new Statistics(4,1, "Calles",2));
		list.add(new Statistics(5,2, "Automovil",20));
		list.add(new Statistics(6,2, "Banco",10));
		list.add(new Statistics(7,2, "Escuela",3));
		list.add(new Statistics(8,3, "Calles",5));
		list.add(new Statistics(8,3, "cajero automatico",9));
		list.add(new Statistics(8,3, "Banco",5));
		list.add(new Statistics(8,4, "Automovil",34));
		list.add(new Statistics(8,4, "Calles",4));
		list.add(new Statistics(8,4, "cajero automatico",35));
		list.add(new Statistics(8,4, "Escuela",53));

		return  list;
	}
}