package com.qa.bm.service;

import java.util.List;

import com.qa.bm.domain.BM;

public interface BMService  {
	
	// CRUD OPERATIONS
	
	BM create(BM m); 
	List<BM> getAll();
	BM getById(Long id); 
	boolean remove(Long id); 
	BM update(Long id, BM newBM);
	BM getCharacterByName(String name); 

}