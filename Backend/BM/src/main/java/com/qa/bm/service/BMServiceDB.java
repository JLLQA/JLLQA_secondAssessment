package com.qa.bm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.bm.domain.BM;
import com.qa.bm.repo.BMRepo;

@Service
public class BMServiceDB implements BMService {

	private BMRepo repo;

	public BMServiceDB(BMRepo repo) {
		this.repo = repo;
	}

	@Override
	public BM create(BM bm) {
		return this.repo.saveAndFlush(bm);
	}

	@Override
	public List<BM> getAll() {
		return this.repo.findAll();
	}

	@Override
	public boolean remove(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	@Override
	public BM update(Long id, BM newBM) {
		Optional<BM> optionalBM = this.repo.findById(id);
		
		BM newM = optionalBM.get();

		newM.setName(newBM.getName());
		newM.setType1(newBM.getType1());
		newM.setType2(newBM.getType2());
		newM.setEdible(newBM.getEdible());

		return this.repo.saveAndFlush(newM);
	}

}
