package com.practise.oops;

public class State extends Country{

    @Override
    public void getPeople(){

        System.out.println("State ppl are called");
    }

    public static void main(String args[]){

        Country country=new State();

    }
}
