package com.LoneAppForUser.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LoneAppForUser.Model.Customer;
import com.LoneAppForUser.Model.Loan;
import com.LoneAppForUser.Service.LoanService;

@RestController
public class LoanControler {
    @Autowired
    private LoanService loanService;

    @GetMapping("/loans")
    public ResponseEntity<List<Loan>> getAllProduct() {
        return ResponseEntity.ok().body(loanService.getAllLoans());
    }

    @GetMapping("/loans/{customerId}")
    public ResponseEntity<List<Loan>> getAllLoansByCustomerId(@PathVariable int customerId) {
        return ResponseEntity.ok().body(this.loanService.getAllLoansByCustomerId(customerId));
    }

    @PostMapping("/loans")
    public ResponseEntity<List<Loan>> getAllLoansByCustomerId(@RequestBody Customer customer) {
        return ResponseEntity.ok().body(loanService.getAllLoansByCustomerId(customer.getCustomerId()));

    }
}
