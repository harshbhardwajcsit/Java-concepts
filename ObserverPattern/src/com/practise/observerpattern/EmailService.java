package com.practise.observerpattern;

import org.jboss.arquillian.core.api.annotation.Observes;

public class EmailService {

    private Object x;
    EmailService(){
        System.out.println(x);
    }

    public void sendEmail(@Observes Cutomer cutomer)
    {
        x=cutomer;
        System.out.println("Email is sent");
    }

}
