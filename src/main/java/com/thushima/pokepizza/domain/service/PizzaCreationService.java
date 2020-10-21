package com.thushima.pokepizza.domain.service;

import com.thushima.pokepizza.domain.exception.ProductException;
import com.thushima.pokepizza.domain.models.Pizza;
import com.thushima.pokepizza.domain.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaCreationService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza create(Pizza pizza) {
        System.out.println("pizza = " + pizza.getName());
        Pizza existPizza = pizzaRepository.findByName(pizza.getName());

        if(existPizza != null && !existPizza.equals(pizza)) {
            throw new ProductException("Pizza já existe!");
        }
        System.out.println("pizza = " + pizza);

        return pizzaRepository.save(pizza);
    }

    public void delete(Long pizzaId) {
        pizzaRepository.deleteById(pizzaId);
    }
}
