package com.valtech.tx.service;

import java.util.List;

import com.valtech.tx.entity.Tx;

public interface TxService {

	Tx createTransaction(Tx ctx);

	Tx getTransaction(Long id);

	List<Tx> getAllTx();

}