package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository txnRepo;
	
	public List<Transaction> findAll () {
		List<Transaction> txns = txnRepo.findAll();
		Collections.sort(txns); 
		return txns;
	}

	public Transaction findById(Long txnId) {		
	return(txnRepo.findTransaction(txnId));	
	}
}
