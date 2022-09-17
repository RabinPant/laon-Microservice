package com.rabin.loan.controller;

import com.rabin.loan.model.Customer;
import com.rabin.loan.model.Loans;
import com.rabin.loan.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer){

        List<Loans> byCustomerIdOrderByStartDtDesc = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());

        if(byCustomerIdOrderByStartDtDesc!=null){

            return  byCustomerIdOrderByStartDtDesc;
        }else{
            return null;
        }

    }
}
