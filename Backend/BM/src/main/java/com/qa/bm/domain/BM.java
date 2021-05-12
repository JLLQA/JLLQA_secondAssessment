package com.qa.bm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type1;
	private String type2;
	private String edible;
	
	public BM(String name, String type1, String type2, String edible) {
		super();
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.edible = edible;
	}
	
	public BM() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getEdible() {
		return edible;
	}

	public void setEdible(String edible) {
		this.edible = edible;
	}

}
