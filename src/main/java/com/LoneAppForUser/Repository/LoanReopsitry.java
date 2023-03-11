package com.LoneAppForUser.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.LoneAppForUser.Model.Loan;

public interface LoanReopsitry extends JpaRepository<Loan, Integer> {
    @Query(value = "select * from loans l where l.customer_id=?1", nativeQuery = true)
    List<Loan> searchByCustomerId(int customerId);

}
