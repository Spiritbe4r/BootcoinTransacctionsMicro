package com.bootcamp.bootcointransactionservice.services.impl;

import com.bootcamp.bootcointransactionservice.documents.Transaction;
import com.bootcamp.bootcointransactionservice.repositories.TransactionRepository;
import com.bootcamp.bootcointransactionservice.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

  @Autowired
  private TransactionRepository repository;

  @Override
  public Mono<Transaction> create(Transaction o) {
    return repository.save(o);
  }

  @Override
  public Flux<Transaction> findAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Transaction> findById(String id) {
    return repository.findById(id);
  }

  @Override
  public Mono<Transaction> update(Transaction obj) {
    return repository.save(obj);
  }

  @Override
  public Mono<Void> delete(Transaction obj) {
    return repository.delete(obj);
  }
}
