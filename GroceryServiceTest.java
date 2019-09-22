package com.grocery;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GroceryServiceTest {

	@Test
	public void testScenario1(){

		 List<PurchasedItem> shoppingCart=new ArrayList<PurchasedItem>();

		PurchasedItem soup=new PurchasedItem();
		soup.setName("soup");
		soup.setCount(3);

		PurchasedItem bread=new PurchasedItem();
		bread.setName("bread");
		bread.setCount(2);

		shoppingCart.add(soup);
		shoppingCart.add(bread);

		GroceryService groceryService=new GroceryService();

		double result=groceryService.calculateTotalPrice(shoppingCart, 1);
		assertEquals(3.15,result,5);

	}

	@Test
	public void testScenario2() {
		 List<PurchasedItem> shoppingCart = new ArrayList<PurchasedItem>();

		PurchasedItem apples = new PurchasedItem();
		apples.setName("apples");
		apples.setCount(6);

		PurchasedItem milk = new PurchasedItem();
		milk.setName("milk");
		milk.setCount(1);

		shoppingCart.add(apples);
		shoppingCart.add(milk);

		GroceryService groceryService = new GroceryService();

		double result = groceryService.calculateTotalPrice(shoppingCart, 1);
		assertEquals(1.90, result, 0);

	}

	@Test
	public void testScenario3() {
		 List<PurchasedItem> shoppingCart = new ArrayList<PurchasedItem>();

		PurchasedItem apples = new PurchasedItem();
		apples.setName("apples");
		apples.setCount(6);

		PurchasedItem milk = new PurchasedItem();
		milk.setName("milk");
		milk.setCount(1);

		shoppingCart.add(apples);
		shoppingCart.add(milk);

		GroceryService groceryService = new GroceryService();

		double result = groceryService.calculateTotalPrice(shoppingCart, 5);
		assertEquals(1.84, result, 4);

	}

	@Test
	public void testScenario4() {
		 List<PurchasedItem> shoppingCart = new ArrayList<PurchasedItem>();

		PurchasedItem apples = new PurchasedItem();
		apples.setName("apples");
		apples.setCount(3);

		PurchasedItem soup = new PurchasedItem();
		soup.setName("soup");
		soup.setCount(2);

		shoppingCart.add(apples);
		shoppingCart.add(soup);

		GroceryService groceryService = new GroceryService();

		double result = groceryService.calculateTotalPrice(shoppingCart, 5);
		assertEquals(1.97, result, 7);

	}

}