package com.assignment.RecipeApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.assignment.RecipeApplication.controller.RecipeController;
import com.assignment.RecipeApplication.exception.ResourceNotFoundException;
import com.assignment.RecipeApplication.model.Recipe;
import com.assignment.RecipeApplication.repository.RecipeRepository;
import com.assignment.RecipeApplication.service.RecipeService;

@ExtendWith(MockitoExtension.class)
class RecipeServiceTest {
	@InjectMocks
	RecipeService obj;

	@Mock
	RecipeRepository repo;

	@Test
	public void testGetAll() {
		List<Recipe> ls = new ArrayList<>();
		ls.add(new Recipe());
		when(repo.findAll()).thenReturn(ls);

		List<Recipe> res = obj.getAll();
		assertTrue(res.size() > 0);
	}

	@Test
	public void testCreateeRecipe() {
		Recipe recipe = new Recipe();
		when(repo.save(recipe)).thenReturn(recipe);

		Recipe res = obj.createeRecipe(recipe);
		assertNotNull(res);

	}

	@Test
	public void testGetRecipeById_ResourceNotFoundException() {
		when(repo.findById(1l)).thenThrow(ResourceNotFoundException.class);

		Assertions.assertThrows(ResourceNotFoundException.class, () -> {
			obj.getRecipeById(1l);
		});
	}

	@Test
	public void testUpdateRecipe_ResourceNotFoundException() {
		when(repo.findById(1l)).thenThrow(ResourceNotFoundException.class);

		Assertions.assertThrows(ResourceNotFoundException.class, () -> {
			obj.updateRecipe(1l, new Recipe());
		});

	}

	@Test
	public void testDeleteRecipe_ResourceNotFoundException() {
		when(repo.findById(1l)).thenThrow(ResourceNotFoundException.class);

		Assertions.assertThrows(ResourceNotFoundException.class, () -> {
			obj.deleteRecipe(1l);
		});
	}

}
