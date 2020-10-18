package com.sda.mikrokredytApp.controller;

import com.sda.mikrokredytApp.service.LoanService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Data
@RestController
@RequestMapping(value = "/loan")
public class LoanController {

   private final LoanService service;
   private final RestTemplate restTemplate;

   @Autowired
    public LoanController (LoanService service, RestTemplate restTemplate){
       this.service = service;
       this.restTemplate = restTemplate;
   }

   @PostMapping
   public ResponseEntity<Loan> createLoan(@RequestBody)

}
