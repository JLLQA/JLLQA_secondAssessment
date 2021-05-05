package com.qa.bm.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.bm.domain.BM;
import com.qa.bm.service.BMService;

@RestController
public class BMController {

	private BMService service;

	public BMController(BMService service) {
		this.service = service;
	}

	// CRUD

	// CREATE
//	{
//	    "id":1,
//	    "name":"Tim",
//	    "type1":"cheese",
//	    "type2":"tomato",
//	    "edible":true 
//	}
	@PostMapping("/create")
	public ResponseEntity<BM> createCharacter(@RequestBody BM marvel) {
		return new ResponseEntity<BM>(this.service.create(marvel), HttpStatus.CREATED);
	}

	// READ
	@GetMapping("/getAll")
	public ResponseEntity<List<BM>> getMarvel() {
		return ResponseEntity.ok(this.service.getAll());
	}

	// READ ONE
	@GetMapping("/getOne/{index}")
	public ResponseEntity<BM> getCharacterById(@PathVariable Long index) {
		return ResponseEntity.ok(this.service.getById(index));
	}

	// DELETE
	@DeleteMapping("/remove/{index}")
	public BM removeCharacter(@PathVariable Long index) {
		this.service.remove(index);
		return this.service.getById(index);
	}

	// UPDATE
//	{
//	    "id":1,
//	    "name":"Jim",
//	    "type1":"cheese",
//	    "type2":"tomato",
//	    "edible":true 
//	}
	@PutMapping("/update/{id}")
	public ResponseEntity<BM> updateCharacter(@PathVariable Long id, @RequestBody BM newObject) {
		return new ResponseEntity<BM>(this.service.update(id, newObject), HttpStatus.ACCEPTED);
	}

	@GetMapping("/findByName")
	public BM findByName(@PathParam("name") String name) {
		for (BM m : this.service.getAll()) {
			System.out.println(m.getName());
		}
		System.out.println(name);
		return null;
	}

}