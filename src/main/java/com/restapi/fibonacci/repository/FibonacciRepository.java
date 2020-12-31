package com.restapi.fibonacci.repository;

import com.restapi.fibonacci.model.Fibonnaci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FibonacciRepository extends JpaRepository<Fibonnaci, Long> {
}
