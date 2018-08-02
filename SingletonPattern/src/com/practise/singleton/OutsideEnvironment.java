package com.practise.singleton;

public class OutsideEnvironment {

    public static void main(String args[]){
        /*
     As SingleTon class have private contructor we cannot create its instance from outside environment
     MySingleTon mySingleTon=new MySingleTon();
        */

        System.out.println("Intance of singleton classs "+ MySingleTon.getInstance());

    }
}
