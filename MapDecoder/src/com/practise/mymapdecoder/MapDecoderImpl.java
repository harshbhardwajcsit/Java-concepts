package com.practise.mymapdecoder;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapDecoderImpl implements MapDecoder {
    @Override
    public Map<String, String> decode(String s) {

//        Map<String, String> decodeMap = null;
//        if (s != null) {
//            decodeMap = new HashMap<>(0);
//            if (!s.isEmpty()) {
//                String[] keyValueArr = s.split("&");
//
//                for (String keyValuePair : keyValueArr) {
//                    if (!keyValuePair.contains("=")) {
//                        throw new IllegalArgumentException("Key Value pair is of invalid format");
//                    }
//
//                    String[] mapString = keyValuePair.split("=");
//                    decodeMap.put(mapString[0], mapString.length > 1 ? mapString[1] : "");
//                }
//            }
//        }
//        return decodeMap;


        if (s == null)
            return null;

        final Map<String, String> decodedMap = new HashMap<>();
        if (s.length() == 0)
            return decodedMap;

        final StringTokenizer queryParamTokenizer = new StringTokenizer(s, "&");

        while (queryParamTokenizer.hasMoreTokens()) {
            final String token = queryParamTokenizer.nextToken();
            final Pattern pattern = Pattern.compile("(?<key>\\w*)=(?<value>\\w*)");
            final Matcher matcher = pattern.matcher(token);
            if (matcher.matches()) {
                decodedMap.put(matcher.group("key"), matcher.group("value"));
            } else {
                throw new IllegalArgumentException("String is in invalid format");
            }
        }

        return decodedMap;




  }
}
