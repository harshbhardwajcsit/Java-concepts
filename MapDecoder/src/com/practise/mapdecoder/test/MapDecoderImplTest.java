package com.practise.mapdecoder.test;

import com.practise.mymapdecoder.MapDecoderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MapDecoderImplTest {

    private MapDecoderImpl mapDecoder;

    @BeforeMethod
    public void setUp() throws Exception {
        mapDecoder = new MapDecoderImpl();
    }

    @Test
    public void testForEmptyArray() throws Exception {
        String string="key1=value1&key2=value2&=&&&&&";
        Map<String,String> actualResult = mapDecoder.decode(string);
        Map<String,String> expectedResult=new HashMap<>();
        expectedResult.put("key1","value1");
        expectedResult.put("key2","value2");
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testForEmptyString() throws Exception{
        String string="";
        Map<String,String> actualResult = mapDecoder.decode(string);
        Map<String,String> expectedResult=new HashMap<>();
        assertEquals(expectedResult,actualResult);
    }

    @Test(expectedExceptions =IllegalArgumentException.class )
    public void testForInvalidParameters() throws Exception {
        //given
        String string="key1=value1&key2=value2&=&&&&&";

        boolean isThrowableException=false;
        try{
            Map<String,String> actualResult = mapDecoder.decode(string);
        }catch (IllegalArgumentException exception){
            isThrowableException=true;
        }
        assertTrue(isThrowableException);

    }

}
