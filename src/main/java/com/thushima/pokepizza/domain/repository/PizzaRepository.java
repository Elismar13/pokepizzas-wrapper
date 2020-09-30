package com.thushima.pokepizza.domain.repository;

import com.thushima.pokepizza.domain.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    ArrayList<Pizza> findAllByFlavor(String flavor);
    Pizza findByName(String name);
}
