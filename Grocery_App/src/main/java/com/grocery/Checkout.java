package com.grocery;

import java.util.List;

public interface Checkout {
	
    double calculateTotal(List<PurchasedItem> items) ;

}
