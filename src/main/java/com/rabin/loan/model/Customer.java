package com.rabin.loan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter @Setter @ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

}
