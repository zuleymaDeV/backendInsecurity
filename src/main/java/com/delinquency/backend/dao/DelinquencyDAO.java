package com.delinquency.backend.dao;

import java.util.List;

import com.delinquency.backend.entity.Delinquency;

public interface DelinquencyDAO {

	List<Delinquency> getDelinquency();
}
