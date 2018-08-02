package com.practise.observerpattern;

import org.jboss.arquillian.core.api.annotation.Observes;

public class CustomerAddingService {
    private Object x;
    CustomerAddingService(){
        System.out.println(x);
    }

    public void addCustomers(@Observes Cutomer cutomer){
        x=cutomer;
        System.out.println("Adding new Customer...");

    }
}
