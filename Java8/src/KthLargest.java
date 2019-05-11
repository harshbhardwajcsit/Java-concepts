import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class KthLargest {

    public int getKthLargestElement(Map<Character, Integer> map, int k) {
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        int counter = 0;
        int kth = -1;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            counter++;
            if (counter == list.size() + 1 - k) {
                kth = list.get(i);
            }
        }
        return kth;
    }


    public static void main(String[] args) {
        String string = "aabcd";
        char a[] = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : a) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        KthLargest kthLargest = new KthLargest();
        int kth = kthLargest.getKthLargestElement(map, 3);
        System.out.println("Kth" + kth);
        TreeSet<Character> characters = new TreeSet<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == kth) {
                characters.add(entry.getKey());
            }
        }

        System.out.println(characters.first());

    }
}
