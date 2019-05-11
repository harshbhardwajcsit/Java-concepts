package com.practise.invoice;


import javax.jws.WebService;

public class CalculatorImpl implements Calculator {
    @Override
    public float getItemFinalPriceIncludingTax(Item item) {
        return 0;
    }

    @Override
    public float getFinalPurchasedPrice(Item item) {
        return 0;
    }
}
