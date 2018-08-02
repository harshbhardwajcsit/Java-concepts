package com.practise.singleton;



public class MySingleTon {
    private static MySingleTon myObj;
    /**
     * Create private constructor
     */
    private MySingleTon(){

    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }

    public void getSomeThing(){
        System.out.println(myObj);
    }

    public static void main(String a[]){
          MySingleTon mySingleTon=new MySingleTon();
          MySingleTon.getInstance();


        mySingleTon.getSomeThing();
    }
}