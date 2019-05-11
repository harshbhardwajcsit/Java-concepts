package com.practise.invoice;

import javax.xml.ws.ServiceMode;

public interface Calculator {
    public float getItemFinalPriceIncludingTax(Item item);
    public float getFinalPurchasedPrice(Item item);
}
