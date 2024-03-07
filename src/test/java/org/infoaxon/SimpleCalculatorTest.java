package org.infoaxon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;



public class SimpleCalculatorTest {
    SimpleCalculator calc = new SimpleCalculator();

    @Test
    void additionTest() {


        Assertions.assertEquals(30, calc.addition(10,20));
    }

    @Test
    @Disabled("Not yet implemented")
    void subtractionTest() {


    }
}
