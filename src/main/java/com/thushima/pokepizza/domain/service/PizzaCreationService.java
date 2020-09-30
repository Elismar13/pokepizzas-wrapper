package com.thushima.pokepizza.domain.service;

import com.thushima.pokepizza.domain.models.Pizza;
import com.thushima.pokepizza.domain.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaCreationService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza create(Pizza pizza) throws Exception {
        Pizza existPizza = pizzaRepository.findByName(pizza.getName());

        if(existPizza != null && !existPizza.equals(pizza)) {
            throw new Exception("Pizza já existe!");
        }

        return pizzaRepository.save(pizza);
    }
}
