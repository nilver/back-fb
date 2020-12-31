package com.restapi.fibonacci.controller;

import com.restapi.fibonacci.model.Dto;
import com.restapi.fibonacci.model.Fibonnaci;
import com.restapi.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fibonacci")
public class MainController {

    @Autowired
    private FibonacciService service;

    /**
     * Generate a new fibonacci
     * @param input
     * @return
     */
    @PostMapping
    public ResponseEntity<Fibonnaci> newFibonacci(@RequestBody Dto input) {
        Fibonnaci fibonnaci = service.getFibonnaci(input.getValue());

        return new ResponseEntity<>(fibonnaci, HttpStatus.OK);
    }

    /**
     * Retrive a history of all fibonacci
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Fibonnaci>> getAllUser() {
        List<Fibonnaci> users = service.listAll();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }



}
