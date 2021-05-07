package com.assignment.RecipeApplication.service;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.assignment.RecipeApplication.exception.ResourceNotFoundException;
import com.assignment.RecipeApplication.model.Recipe;
import com.assignment.RecipeApplication.repository.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
	RecipeRepository repo;

	// get list of recipes rest api
	public List<Recipe> getAll() {

		return repo.findAll();

	}

	// create recipe rest api
	@Transactional
	public Recipe createeRecipe(@RequestBody Recipe recipe) {
		Format f = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		String str = f.format(new Date());
		recipe.setDate(str);
		return repo.save(recipe);

	}

	// get recipe by id rest api
	public Recipe getRecipeById(@PathVariable Long id) {
		Recipe recipe = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("recipes not exist with id :" + id));
		return recipe;
	}

	// update recipe rest api
	@Transactional
	public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe rec) {
		Recipe recipe = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("recipes not exist with id :" + id));

		recipe.setDishName(rec.getDishName());
		recipe.setDate(rec.getDate());
		recipe.setIndicator(rec.getIndicator());
		recipe.setDishSuitableFor(rec.getDishSuitableFor());
		recipe.setCookingInstructions(rec.getCookingInstructions());
		recipe.setIngredients(rec.getIngredients());

		Recipe updatedRecipe = repo.save(recipe);
		return updatedRecipe;
	}

	// delete recipe rest api
	public String deleteRecipe(@PathVariable Long id) {
		Recipe recipe = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("recipe not exist with id :" + id));

		repo.delete(recipe);
		return "Recipe Deleted Successfully" + id;
	}

}
