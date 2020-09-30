package com.thushima.pokepizza.api.controllers;

import com.thushima.pokepizza.domain.models.Pizza;
import com.thushima.pokepizza.domain.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/pizza")
public class PizzaController {
	@Autowired
	private PizzaRepository pizzaRepository;

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Pizza createPizza(@RequestBody Pizza pizza) {
		return pizzaRepository.save(pizza);
	}

	@GetMapping
	public List<Pizza> findAllByFlavor(@RequestParam String flavor) {
		return pizzaRepository.findAllByFlavor(flavor);
	}
}