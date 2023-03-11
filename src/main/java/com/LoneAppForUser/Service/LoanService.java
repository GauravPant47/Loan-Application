package com.LoneAppForUser.Service;

import java.util.List;

import com.LoneAppForUser.Model.Loan;

public interface LoanService {

    List<Loan> getAllLoans();

    List<Loan> getAllLoansByCustomerId(int customerId);

}
