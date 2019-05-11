package com.practise.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpellBob {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        while(test>0){
            String upface=scanner.next();
            String downface=scanner.next();
            char array1[]=upface.toCharArray();
            char array2[]=downface.toCharArray();
            boolean result=true;
            Map<Character,Integer> map=new HashMap<>();
            map.put('b',0);
            map.put('o',0);

            for(int i=0;i<array1.length;i++){

            }




            test--;
        }
    }
}
