package com.qa.bm.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.bm.domain.BM;
import com.qa.bm.repo.BMRepo;

@SpringBootTest
public class BMServiceUnitTest {
	
	@Autowired
	private BMServiceDB service; 
	
	@MockBean
	private BMRepo repo; 
	
	@Test
	void testCreate() {	
		BM jim = new BM("Jim", "Bun", "Tomato", "Yes");
		BM savedJim = new BM(1L,"Jim", "Bun", "Tomato", "Yes");
		 
		Mockito.when(this.repo.saveAndFlush(jim)).thenReturn(savedJim);
		
		assertThat(this.service.create(jim)).isEqualTo(savedJim);
		
		Mockito.verify(this.repo, Mockito.times(1)).saveAndFlush(jim);
	}
	
	@Test
	void testGetAll() {	
		List<BM> bm = new ArrayList<>();
		bm.add(new BM(1L,"Jim", "Bun", "Tomato", "Yes"));

		Mockito.when(this.repo.findAll()).thenReturn(bm);

		assertEquals(bm, this.service.getAll());

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}
	
	@Test
	void testUpdate() {
		BM newBM = new BM("James", "Bun", "Tomato", "Yes");
		Optional<BM> OC = Optional.of(new BM(1L, null, null, null, null));
		BM updated = new BM(1L,
				newBM.getName(),
				newBM.getType1(),
				newBM.getType2(),
				newBM.getEdible());
		
		Mockito.when(this.repo.findById(1L)).thenReturn(OC);
		Mockito.when(this.repo.saveAndFlush(updated)).thenReturn(updated);
		
		assertThat(this.service.update(1L, newBM)).isEqualTo(updated);
		
		Mockito.verify(this.repo, Mockito.times(1)).findById(1L);
		Mockito.verify(this.repo, Mockito.times(1)).saveAndFlush(updated);		
	}
	
	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(repo.existsById(ID)).thenReturn(false);

		assertEquals(true, this.service.remove(ID));

		Mockito.verify(repo, Mockito.times(1)).deleteById(ID);
		Mockito.verify(repo, Mockito.times(1)).existsById(ID);

	}
	
}