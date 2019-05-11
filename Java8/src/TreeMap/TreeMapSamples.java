package TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSamples {

    public static void main(String[] args) {

        //we have to define object as TreeMap to use NavigableMap functions
        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i=0;i<10;i++) {
            map.put(i, i+"");
        }

        System.out.println(map);

        Map<Integer, String> reversedMap = map.descendingMap();
        System.out.println("Reversed Map: "+reversedMap);

//
//        //submap example
        Map<Integer, String> subMap = map.subMap(2, true, 6, true);
        System.out.println("Submap: "+subMap);
//
        subMap = map.headMap(5, true);
        System.out.println("HeadMap: "+subMap);
//
        subMap = map.tailMap(5, true);
        System.out.println("TailMap: "+subMap);

    }
}
