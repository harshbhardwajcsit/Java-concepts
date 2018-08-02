package com.practise.observerpattern;

import org.jboss.arquillian.core.api.Event;
import org.jboss.arquillian.core.api.annotation.Inject;

import java.util.ArrayList;
import java.util.EventListener;

public class RequestForCustomers {

    private Event<Cutomer> cutomerEvent;
    public void notifyObservor(Cutomer cutomer){
        this.cutomerEvent.fire(cutomer);
    }

    public void checkForObservers(){
        CustomerAddingService customerAddingService=new CustomerAddingService();
        AuthenticationService authenticationService=new AuthenticationService();
        EmailService emailService=new EmailService();
    }


    public static void main(String args[]){

        RequestForCustomers requestForCustomers=new RequestForCustomers();
        Cutomer cutomer=new Cutomer();
        cutomer.setName("harsh");
        cutomer.setOccupation("Engineer");
        cutomer.setMail("xyz@gmail.com");
        requestForCustomers.notifyObservor(cutomer);

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(null);




    }
}
