package com.practise.oops;

public class State{

    public void getPeople(State state){
        System.out.println("This method only works for state");
    }


    public static void main(String args[]){

        Country country=new Country();
        country.getPeople();

    }
}


public class Country{
    public void getPeople(Country country){
        System.out.println("This method only works for country");
    }
}
