package TreeMap;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class TreeMapOperations {

    TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            } else if (o2 > o1) {
                return 1;
            } else {
                return 0;
            }
        }
    });

    public SortedMap<Integer, Integer> getSortedMap() {
        return sortedMap;
    }

    public void setSortedMap(SortedMap sortedMap) {
        this.sortedMap = sortedMap;
    }

    SortedMap<Integer, Integer> sortedMap = Collections.synchronizedSortedMap(new TreeMap<>());
    Map<Integer, Integer> sortedMap2 = Collections.synchronizedMap(new HashMap<Integer, Integer>());

    public TreeMap<Integer, Integer> getTreeMap() {
        return treeMap;
    }
}

class Operations extends TreeMapOperations {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.getTreeMap()
                .put(1, 4);
        operations.getTreeMap()
                .put(2, 2);
        operations.getTreeMap()
                .put(3, 3);

        System.out.println(operations.getTreeMap());

        operations.getSortedMap()
                .put(1, 2);

        Collection collection = (Collection) operations.getTreeMap().values();

        System.out.println("collections" + collection.getClass());
        Stack<Integer> stack = new Stack<>();

        Iterator<Integer> iterator = collection.iterator();
        int top = -1;
        while (iterator.hasNext()) {
            if (top == -1) {
                stack.push(iterator.next());
                top++;
            } else {
                if (iterator.next() > stack.get(top)) {
                    int value = iterator.next();

                } else {
                    stack.push(iterator.next());
                    top++;
                }
            }
        }


    }
}

