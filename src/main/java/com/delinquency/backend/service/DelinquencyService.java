package com.delinquency.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delinquency.backend.dao.DelinquencyDAO;
import com.delinquency.backend.dao.StateDAO;
import com.delinquency.backend.dao.StatisticsDAO;
import com.delinquency.backend.entity.Delinquency;
import com.delinquency.backend.entity.State;
import com.delinquency.backend.entity.Statistics;

@Service
public class DelinquencyService {
	
	@Autowired
	StateDAO stateDAO;
	
	public List<State> getState() {
		return stateDAO.getState();
	}

	@Autowired
	DelinquencyDAO delinquencyDAO;
	
	public List<Delinquency> getDelinquency() {
		return delinquencyDAO.getDelinquency();
	}

	@Autowired
	StatisticsDAO statisticsDAO;
	
	public List<Statistics> getStatistics() {
		return statisticsDAO.getStatistics();
	}
}
