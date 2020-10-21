package com.thushima.pokepizza.api.controllers;

import com.thushima.pokepizza.domain.models.Pizza;
import com.thushima.pokepizza.domain.repository.PizzaRepository;
import com.thushima.pokepizza.domain.service.PizzaCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products/pizza")
public class PizzaController {
	@Autowired
	private PizzaRepository pizzaRepository;

	@Autowired
	private PizzaCreationService pizzaCreation;

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Pizza createPizza(@RequestBody Pizza pizza) {
		return pizzaCreation.create(pizza);
	}

	@GetMapping("/all")
	public List<Pizza> getAllPizzas() {
		return pizzaRepository.findAll();
	}

	@GetMapping()
	public ArrayList<Pizza> findAllByFlavor(@RequestParam() String flavor) {
		return pizzaRepository.findAllByFlavor(flavor);
	}

	@DeleteMapping("/{pizzaId}")
	public ResponseEntity<> deleteById(@PathVariable Long pizzaId) {
		if(pizzaRepository.findById(pizzaId) == null) {
			ResponseEntity.notFound();
		}
		pizzaRepository.deleteById(pizzaId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}