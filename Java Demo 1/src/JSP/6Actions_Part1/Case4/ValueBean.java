package com.ted;

import java.io.Serializable;

public class ValueBean implements Serializable {
	
    private int price, quantity, total;

    public void setPrice(int p) {
        this.price= p;
    }

    public void setQuantity(int n) {
        this.quantity= n;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getTotal() {
        total= getPrice()*getQuantity();
        return total;
    }
}
