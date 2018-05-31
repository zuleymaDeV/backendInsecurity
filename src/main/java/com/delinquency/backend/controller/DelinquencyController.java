package com.delinquency.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delinquency.backend.entity.Delinquency;
import com.delinquency.backend.entity.State;
import com.delinquency.backend.entity.Statistics;
import com.delinquency.backend.service.DelinquencyService;

@RestController
public class DelinquencyController {

	@Autowired
	DelinquencyService delinquencyService;

	@GetMapping(value="/api/state", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<State> index() {
		return delinquencyService.getState();
	}
	
	@GetMapping(value="/api/delinquency",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Delinquency> del() {
		return delinquencyService.getDelinquency();
	}
	
	@GetMapping(value="/api/statistics", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Statistics> stat() {
		return delinquencyService.getStatistics();
	}

}
