package com.restapi.fibonacci.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fibonnaci implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;

    @Column(columnDefinition="TEXT")
    private String value;

    @Column(columnDefinition="TEXT")
    private String fb;



}
