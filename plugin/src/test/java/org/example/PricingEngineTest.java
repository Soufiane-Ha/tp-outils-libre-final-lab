package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PricingEngineTest {

    @Test
    void regularCustomerWithSave10() {

        PricingEngine engine = new PricingEngine();

        double result = engine.calculate(
                new double[] { 100, 50 },
                new int[] { 1, 2 },
                "REGULAR",
                "SAVE10");

        assertEquals(207, result, 0.1);
    }

    @Test
    void vipCustomerWithSave20() {

        PricingEngine engine = new PricingEngine();

        double result = engine.calculate(
                new double[] { 200 },
                new int[] { 1 },
                "VIP",
                "SAVE20");

        assertEquals(172.5, result, 0.1);
    }
}