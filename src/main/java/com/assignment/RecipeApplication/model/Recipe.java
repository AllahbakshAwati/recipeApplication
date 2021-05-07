package com.assignment.RecipeApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recipe_Table")
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String dishName;
	private String date;
	private String indicator;
	private int dishSuitableFor;
	private String cookingInstructions;
	private String ingredients;

	public Recipe() {

	}

	public String getDishName() {
		return dishName;
	}

	public Recipe(Long id, String dishName, String date, String indicator, int dishSuitableFor,
			String cookingInstructions, String ingredients) {
		super();
		this.id = id;
		this.dishName = dishName;
		this.date = date;
		this.indicator = indicator;
		this.dishSuitableFor = dishSuitableFor;
		this.cookingInstructions = cookingInstructions;
		this.ingredients = ingredients;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public int getDishSuitableFor() {
		return dishSuitableFor;
	}

	public void setDishSuitableFor(int dishSuitableFor) {
		this.dishSuitableFor = dishSuitableFor;
	}

	public String getCookingInstructions() {
		return cookingInstructions;
	}

	public void setCookingInstructions(String cookingInstructions) {
		this.cookingInstructions = cookingInstructions;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

}
