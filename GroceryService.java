package com.grocery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



public class GroceryService {

	public  double calculateTotalPrice( List<PurchasedItem> shoppingCart, int days){
		
		SimpleCheckout pricing = new SimpleCheckout();
		
		StockItem soup= new StockItem("soup", 0.65);
		StockItem bread= new StockItem("bread", 0.80);
		StockItem milk= new StockItem("milk", 1.30);
		StockItem apple= new StockItem("apple", 0.10);
		
		pricing.addPrice(soup);
		pricing.addPrice(bread);
		pricing.addPrice(milk);
		pricing.addPrice(apple);
		

	    DiscountValue d = new DiscountValue
	    		(pricing, "soup", 2, "bread" ,0.5,getDiscountDate(-1),getDiscountDate(7)); 
	     d = new DiscountValue
	    		(pricing, "apple", 1, "apple" ,0.1,getDiscountDate(3),getMonthEndDate());
	   
	 
       
       return d.calculateTotal(shoppingCart);
	   
	   
	}
	
	
	private static Date getDiscountDate(int days) {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, days);
	    return cal.getTime();
	}

	private static Date getMonthEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}
}
