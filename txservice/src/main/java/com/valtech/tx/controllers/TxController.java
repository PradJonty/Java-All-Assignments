package com.valtech.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.tx.entity.Tx;
import com.valtech.tx.service.TxService;

@RestController
public class TxController {
	
	@Autowired
	private TxService txService;

	@PostMapping("/api/tx/")
	public Tx createTransaction(@RequestBody Tx ctx) {
		return txService.createTransaction(ctx);
	}
@GetMapping("/api/tx/{id}")
	public Tx getTransaction(Long id) {
		return txService.getTransaction(id);
	}
@GetMapping("api/tx/")
	public List<Tx> getAllTx() {
		return txService.getAllTx();
	}
	
	
 
}
