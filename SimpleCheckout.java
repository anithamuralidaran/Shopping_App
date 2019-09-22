package com.grocery;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SimpleCheckout implements Checkout{
	
	
	 private final List<StockItem> stockItems = new ArrayList<>();

	    public void addPrice(StockItem item) {
	        stockItems.add(item);
	    }
   

    public double calculateTotal(List<PurchasedItem> items) {
    	double actualTotalCostOfItems=0;
    
    	DecimalFormat df = new DecimalFormat("#.00"); 
    	
    	for(PurchasedItem p :items) {
    		System.out.println(p);
    		StockItem stock = stockItems.stream().filter(s->s.getName().equals(p.getName())).findAny().get();
    		System.out.println(stock);
    		actualTotalCostOfItems+=stock.getPrice()*p.getCount();
    		
    		actualTotalCostOfItems=Double.valueOf(df.format(actualTotalCostOfItems));
    		System.out.println("Total Cost Of Items  " + actualTotalCostOfItems);
    		
    	}
    	return actualTotalCostOfItems;
    	
    }


	

}
