package com.practise.findarray.test;

import com.practise.findarray.FindArrayImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindArrayImplTest {
    private FindArrayImpl findArray;
    @BeforeMethod
    public void setUp() throws Exception {
        findArray = new FindArrayImpl();
    }

    @Test
    public void testForEmptyArray() throws Exception {
        int[] A = {};
        int [] B={1, 4, 5};
        Assert.assertEquals(findArray.findArray(A,B), -1);
    }

    @Test
    public void testForEmptySubArray() throws Exception {
        int[] A = {1, 3, 5, 3, 6};
        int [] B= {1};
        Assert.assertEquals(findArray.findArray(A,B), 0);
    }

    @Test
    public void testForSubArrayInTheEnd(){
        int[] A = {1, 2, 7, 4, 7, 0, 7, 4, 7, 9, 7, 4, 7};
        int [] B= {7, 4, 7};
        Assert.assertEquals(findArray.findArray(A,B),10);
    }

    @Test
    public void testForNoSubArrayFound(){
        int[] A = {1, 3, 5, 3, 6};
        int [] B= {1, 6};
        Assert.assertEquals(findArray.findArray(A,B),-1);
    }

    @Test
    public void testIfSubArrayHasMoreLength(){
        int[] A = {1, 3, 5, 3, 6};
        int [] B= {1, 6, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(findArray.findArray(A,B),-1);
    }

    @Test
    public void testIfArrayIsNull(){
        int[] A = null;
        int [] B= {1, 6, 3, 4, 5, 6, 7,8,9};
        Assert.assertEquals(findArray.findArray(A,B),-1);
    }
}


