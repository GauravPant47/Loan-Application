package com.LoneAppForUser.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoneAppForUser.Model.Loan;
import com.LoneAppForUser.Repository.LoanReopsitry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanReopsitry loanReopsitry;

    @Override
    public List<Loan> getAllLoans() {
        return this.loanReopsitry.findAll();
    }

    @Override
    public List<Loan> getAllLoansByCustomerId(int customerId) {
        // TODO Auto-generated method stub
        return this.loanReopsitry.searchByCustomerId(customerId);
    }

}
