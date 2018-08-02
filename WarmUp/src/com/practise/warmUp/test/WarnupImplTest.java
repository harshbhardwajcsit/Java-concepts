package com.practise.warmUp.test;

import com.practise.warmUp.com.practise.warmUp.main.WarmupImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WarnupImplTest {

    private WarmupImpl warmupTest;
    @BeforeMethod
    public void setUp() throws Exception {
        warmupTest = new WarmupImpl();
    }

    @Test
    public void testForEmptyArray() throws Exception {
        int[] A = {};
        Assert.assertEquals(warmupTest.findMax(A), -1);
    }

    @Test
    public void testForArrayWithNonNegativeInterger() throws Exception {
        int[] A = {1, 3, 5};

        Assert.assertEquals(warmupTest.findMax(A), 2);
    }

}
