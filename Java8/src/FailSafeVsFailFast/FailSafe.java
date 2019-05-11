package FailSafeVsFailFast;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
    public static void iterateCHM(){
        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,1);
        concurrentHashMap.put(2,1);
        concurrentHashMap.put(3,1);
        concurrentHashMap.put(4,1);

        Iterator iterator = concurrentHashMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

            //add
            concurrentHashMap.put(5,1);

            //update
            if(concurrentHashMap.containsKey(1)){
                concurrentHashMap.put(1,3);
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        FailSafe.iterateCHM();
    }
}
