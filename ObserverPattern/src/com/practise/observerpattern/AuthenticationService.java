package com.practise.observerpattern;

import org.jboss.arquillian.core.api.annotation.Observes;

public class AuthenticationService {

    private Object x;
    AuthenticationService(){
        System.out.println(x);
    }

    public void authenticateCustomer(@Observes Cutomer cutomer)
    {
        x=cutomer;
        System.out.println("Authenticated");
    }
}
