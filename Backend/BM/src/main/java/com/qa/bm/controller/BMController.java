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
	@PostMapping("/create")
	public ResponseEntity<BM> createBM(@RequestBody BM bm) {
		return new ResponseEntity<BM>(this.service.create(bm), HttpStatus.CREATED);
	}

	// READ
	@GetMapping("/getAll")
	public ResponseEntity<List<BM>> getBM() {
		return ResponseEntity.ok(this.service.getAll());
	}

	// READ ONE
	@GetMapping("/getOne/{index}")
	public ResponseEntity<BM> getBMById(@PathVariable Long index) {
		return ResponseEntity.ok(this.service.getById(index));
	}

	// DELETE
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Boolean> removeBM(@PathVariable Long id) {
		return this.service.remove(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT):
			new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);		 
	}

	// UPDATE
	@PutMapping("/update/{id}")
	public ResponseEntity<BM> updateBM(@PathVariable Long id, @RequestBody BM newObject) {
		return new ResponseEntity<BM>(this.service.update(id, newObject), HttpStatus.ACCEPTED);
	}

	@GetMapping("/findByName")
	public BM findByName(@PathParam("name") String name) {
		return this.service.getBMByName(name);
	}

}