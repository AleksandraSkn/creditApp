package com.sda.mikrokredytApp.service;

import com.sda.mikrokredytApp.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository repository;

    @Autowired
    public LoanService(LoanRepository repository){
        this.repository = repository;
    }

}
