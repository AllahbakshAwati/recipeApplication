package com.assignment.RecipeApplication.validator;

import org.springframework.stereotype.Component;

import com.assignment.RecipeApplication.model.Recipe;

@Component
public class ValidatorUtil {

	private static final String RECIPE_OBJECT_NULL = "Recipe object parameter is null";
	private static final String RECIPE_NAME_IS_NULL = "Recipe name has null value";
	private static final String RECIPE_INDICATOR_IS_NULL = "Recipe indicator has null value";
	private static final String RECIPE_DISHSUITABLEFOR_IS_NULL = "Recipe dishSuitableFor has null value";
	private static final String RECIPE_COOKINGINSTRUCTIOS_IS_NULL = "Recipe cookingInstructions has null value";
	private static final String RECIPE_INGREDIENTS_IS_NULL = "Recipe ingredients has null value";

	// Validate the recipe object
	public Boolean validateInput(Recipe recipe) {
		if (null == recipe) {
			throw new IllegalArgumentException(RECIPE_OBJECT_NULL);
		}
		if (recipe.getDishName().equals(null) || recipe.getDishName().isEmpty()) {
			throw new IllegalArgumentException(RECIPE_NAME_IS_NULL);
		} else if (recipe.getIndicator().equals(null) || recipe.getIndicator().isEmpty()) {
			throw new IllegalArgumentException(RECIPE_INDICATOR_IS_NULL);
		} else if (0 == recipe.getDishSuitableFor()) {
			throw new IllegalArgumentException(RECIPE_DISHSUITABLEFOR_IS_NULL);
		} else if (recipe.getCookingInstructions().equals(null) || recipe.getCookingInstructions().isEmpty()) {
			throw new IllegalArgumentException(RECIPE_COOKINGINSTRUCTIOS_IS_NULL);
		} else if (recipe.getIngredients().equals(null) || recipe.getIngredients().isEmpty()) {
			throw new IllegalArgumentException(RECIPE_INGREDIENTS_IS_NULL);
		} else {
			return Boolean.TRUE;
		}
	}

}