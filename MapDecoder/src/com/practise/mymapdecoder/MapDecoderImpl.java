package com.practise.mymapdecoder;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapDecoderImpl implements MapDecoder {
    @Override
    public Map<String, String> decode(String string) {

        if (string == null)
            return null;

        final Map<String, String> decodedMap = new HashMap<>();
        if (string.length() == 0)
            return decodedMap;

        final StringTokenizer queryParamTokenizer = new StringTokenizer(string, "&");

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
