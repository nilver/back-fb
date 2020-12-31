package com.restapi.fibonacci.service;


import com.restapi.fibonacci.model.Fibonnaci;
import com.restapi.fibonacci.repository.FibonacciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class FibonacciService {

    @Autowired
    private FibonacciRepository repository;

    /**
     * retrive all fibonacci
     * @return
     */
    public List<Fibonnaci> listAll() {

        return repository.findAll();
    }

    /**
     * Create a new fibonacci number
     * @param number
     * @return
     */
    public Fibonnaci getFibonnaci(BigInteger number) {
        Fibonnaci fibonnaci = new Fibonnaci();
        fibonnaci.setValue(number.toString());
        fibonnaci.setFb(generateFibonacci(number).toString());

        return repository.save(fibonnaci);
    }


    /**
     * Generate a new fibonacci. Using iterative algorithm
     * @param number
     * @return
     */
    private BigInteger generateFibonacci(BigInteger number) {

        BigInteger num1 = BigInteger.ZERO, num2 = BigInteger.ONE;

        BigInteger counter = BigInteger.ZERO;
        while (counter.compareTo(number) == -1 ) {
            BigInteger num3 = num2.add(num1);
            num1 = num2;
            num2 = num3;
            counter = counter.add(BigInteger.ONE);
        }
        return num1;
    }
}
