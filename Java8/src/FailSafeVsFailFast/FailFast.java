package FailSafeVsFailFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void iterateArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            /* add */
//            list.add(5);

            /*remove*/
//            list.remove(2);

            /*remove conditionally*/
            if(iterator.next().equals(list.get(1))){
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        FailFast.iterateArrayList();
    }
}
