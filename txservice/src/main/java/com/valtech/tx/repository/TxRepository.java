package com.valtech.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtech.tx.entity.Tx;



public interface TxRepository extends JpaRepository<Tx, Long>  {
	

}
