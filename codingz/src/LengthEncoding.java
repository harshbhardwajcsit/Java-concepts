import java.util.LinkedHashMap;
import java.util.Map;

public class LengthEncoding {
    public static void main(String[] args) {
        String string = "aaabbbbcc";
        char[] chars = string.toCharArray(); //tc=O(n)
        final LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>(); //sc = O(n)
        for (char aChar : chars) {
            if (linkedHashMap.containsKey(aChar)) {
                linkedHashMap.put(aChar, linkedHashMap.get(aChar) + 1);
            } else {
                linkedHashMap.put(aChar, 1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());
        }
        System.out.println(stringBuilder);
    }
}
