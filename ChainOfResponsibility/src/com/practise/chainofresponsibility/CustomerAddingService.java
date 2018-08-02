package com.practise.chainofresponsibility;

public class CustomerAddingService {

    public void addCustomers(Cutomer cutomer){
        System.out.println("Adding new Customer...");
        try{
            System.out.println("Customer name"+cutomer.getName());
        }catch (Exception exception){
            System.out.println("Exception while adding new customer");
        }

    }
}
