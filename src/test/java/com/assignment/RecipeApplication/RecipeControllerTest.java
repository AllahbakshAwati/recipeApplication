package com.assignment.RecipeApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.assignment.RecipeApplication.controller.RecipeController;
import com.assignment.RecipeApplication.model.Recipe;
import com.assignment.RecipeApplication.service.RecipeService;
import com.assignment.RecipeApplication.validator.ValidatorUtil;

@ExtendWith(MockitoExtension.class)
class RecipeControllerTest {
	@InjectMocks
	RecipeController obj;

	@Mock
	RecipeService service;

	@Mock
	ValidatorUtil util;

	@Mock
	Recipe recipe;

	@Test

	public void testGetAll() {
		List<Recipe> ls = new ArrayList<>();
		ls.add(new Recipe());
		when(service.getAll()).thenReturn(ls);

		ResponseEntity<List<Recipe>> res = obj.getAll();
		assertNotNull(res);
	}

	@Test
	public void testCreateeRecipe() {

		when(util.validateInput(recipe)).thenReturn(true);
		when(service.createeRecipe(recipe)).thenReturn(recipe);

		ResponseEntity<Recipe> res = obj.createeRecipe(recipe);

		assertNotNull(res);

	}

	@Test
	public void testGetRecipeById() {
		when(service.getRecipeById(1l)).thenReturn(recipe);

		ResponseEntity<Recipe> res = obj.getRecipeById(1l);
		assertNotNull(res);
	}

	@Test
	public void testUpdateRecipe() {
		when(util.validateInput(recipe)).thenReturn(true);
		when(service.updateRecipe(1l, recipe)).thenReturn(recipe);

		ResponseEntity<Recipe> res = obj.updateRecipe(1l, recipe);
		assertNotNull(res);

	}

	@Test
	public void testDeleteRecipe() {

		when(service.deleteRecipe(1l)).thenReturn("deleted");

		ResponseEntity<String> res = obj.deleteRecipe(1l);
		assertNotNull(res);

	}

}
