package com.qa.bm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.bm.domain.BM;

@Repository
public interface BMRepo extends JpaRepository<BM, Long> {

//	BM findByName(String name);
}
