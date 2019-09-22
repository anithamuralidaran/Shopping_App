package com.grocery;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

public class DiscountValue implements Checkout {

	  private final Checkout baseCheckout;
	    private final String item;
	    private final String discountedItem;
	    private final int noOfItems;
	    private final double discount;
	    private final Date disStartDate;
	    private final Date disEndDate;

	    public DiscountValue(Checkout base, String item, int noOfItems, String discountedItem, double discount, Date disStartDate,Date disEndDate) {
	         this.baseCheckout = base;
	         this.item = item;
	         this.discountedItem = discountedItem;
	         this.noOfItems = noOfItems;  
	         this.discount = discount;
	         this.disStartDate = disStartDate;
	         this.disEndDate = disEndDate;
	    }

	    public double calculateTotal(List<PurchasedItem> items) {
	    	NumberFormat nf = NumberFormat.getInstance();
	    	nf.setMaximumFractionDigits(2);
	    double deduction = 0;
	   //TODO deduction logic and date check 
	    return Double.parseDouble(nf.format(baseCheckout.calculateTotal(items) - deduction));

	    }

}
