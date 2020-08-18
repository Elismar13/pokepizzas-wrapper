package com.thushima.pokepizza.controllers;

import com.thushima.pokepizza.models.Pizza;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

	@RequestMapping(method = RequestMethod.POST, value="/products")
	public Pizza createPizza(
		@RequestParam(value = "id") int id,
		@RequestParam(value = "name") String name,
		@RequestParam(value="description") String description,
		@RequestParam(value="type") String type,
		@RequestParam(value="price") float price,
		@RequestParam(value="flavor") String flavor
		) {
			return new Pizza(id, name, description, type, price, flavor);
		}
}