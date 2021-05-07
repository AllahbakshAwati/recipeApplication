package com.assignment.RecipeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.RecipeApplication.model.Recipe;
import com.assignment.RecipeApplication.service.RecipeService;
import com.assignment.RecipeApplication.validator.ValidatorUtil;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class RecipeController {
	@Autowired
	RecipeService service;

	@Autowired
	ValidatorUtil util;

	// get list of recipes rest api
	@GetMapping("recipes")
	public ResponseEntity<List<Recipe>> getAll() {

		return new ResponseEntity<List<Recipe>>(service.getAll(), HttpStatus.OK);

	}

	// create recipe rest api
	@PostMapping("/recipes")
	public ResponseEntity<Recipe> createeRecipe(@RequestBody Recipe recipe) {
		// Validate the recipe object before creating
		util.validateInput(recipe);

		return new ResponseEntity<Recipe>(service.createeRecipe(recipe), HttpStatus.CREATED);
	}

	// get recipe by id rest api
	@GetMapping("/recipes/{id}")
	public ResponseEntity<Recipe> getRecipeById(@PathVariable Long id) {
		return new ResponseEntity<Recipe>(service.getRecipeById(id), HttpStatus.OK);
	}

	// update recipe rest api
	@PutMapping("/recipes/{id}")
	public ResponseEntity<Recipe> updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
		// Validate the recipe object before updating
		util.validateInput(recipe);

		return new ResponseEntity<Recipe>(service.updateRecipe(id, recipe), HttpStatus.OK);
	}

	// delete recipe rest api
	@DeleteMapping("/recipes/{id}")
	public ResponseEntity<String> deleteRecipe(@PathVariable Long id) {

		return new ResponseEntity<String>(service.deleteRecipe(id), HttpStatus.OK);
	}
}
