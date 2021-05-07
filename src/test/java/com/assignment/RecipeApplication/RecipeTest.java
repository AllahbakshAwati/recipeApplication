package com.assignment.RecipeApplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.assignment.RecipeApplication.model.Recipe;

class RecipeTest {

	@Test
	public void testGetDishName() {
		Recipe obj=new Recipe();
		obj.setDishName("name");
		String res = obj.getDishName();
		assertEquals("name", res);
	}

	@Test
	public void testSetId() {
		Recipe obj=new Recipe();
		obj.setId(2l);
	}

	@Test
	public void testGetId() {
		Recipe obj=new Recipe();
		obj.setId(2l);
		long res = obj.getId();
		assertEquals(2l, res);
	}

	@Test
	public void testSetDishName() {
		Recipe obj=new Recipe();
		obj.setDishName("name");
	}

	@Test
	public void testGetDate() {
		Recipe obj=new Recipe();
		obj.setDate("24-04-2021");
		String res = obj.getDate();
		assertEquals("24-04-2021", res);
	}

	@Test
	public void testSetDate() {
		Recipe obj=new Recipe();
		obj.setDate("24-04-2021");
	}

	@Test
	public void testGetIndicator() {
		Recipe obj=new Recipe();
		obj.setIndicator("veg");
		String res = obj.getIndicator();
		assertEquals("veg", res);
	}

	@Test
	public void testSetIndicator() {
		Recipe obj=new Recipe();
		obj.setIndicator("veg");
	}

	@Test
	public void testGetDishSuitableFor() {
		Recipe obj=new Recipe();
		obj.setDishSuitableFor(4);
		int res = obj.getDishSuitableFor();
		assertTrue(res == 4);
	}

	@Test
	public void testSetDishSuitableFor() {
		Recipe obj=new Recipe();
		obj.setDishSuitableFor(4);
	}

	@Test
	public void testGetCookingInstructions() {
		Recipe obj=new Recipe();
		obj.setCookingInstructions("cooked");
		String res = obj.getCookingInstructions();
		assertEquals("cooked", res);
	}

	@Test
	public void testSetCookingInstructions() {
		Recipe obj=new Recipe();
		obj.setCookingInstructions("cooked");
	}

	@Test
	public void testGetIngredients() {
		Recipe obj=new Recipe();
		obj.setIngredients("paneer");
		String res = obj.getIngredients();
		assertEquals("paneer", res);
	}

	@Test
	public void testSetIngredients() {
		Recipe obj=new Recipe();
		obj.setIngredients("paneer");
	}

}


