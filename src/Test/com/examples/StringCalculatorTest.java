package com.examples;
import org.junit.*;

/**
 * Created by lopam on 01/04/2017.
 */
public class StringCalculatorTest {
    @BeforeClass  //Run once before all the test cases

    public static void Setup() {
        System.out.println("Test failed as no code is written");
    }

    @Test

    public  void testcase1 ()
            {

                StringCalculator stringCalculator = new StringCalculator();
                Assert.assertEquals(stringCalculator.add(1,5),6);
                System.out.println("Test passed");
            }
            @Test
    public  void testcase2 ()
    {

        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(stringCalculator.add(1,5),7);
        System.out.println("Test failed");
    }




}
