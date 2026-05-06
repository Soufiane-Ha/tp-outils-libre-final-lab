package org.example;

import org.example.model.CustomerType;
import org.example.model.PricingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PricingEngineTest {

    @Test
    void regularCustomerWithSave10() {

        PricingService service = new PricingService();

        double result = service.calculateFinalPrice(
                new double[] { 100, 50 },
                new int[] { 1, 2 },
                CustomerType.REGULAR,
                "SAVE10");

        assertEquals(207, result, 0.1);
    }

    @Test
    void vipCustomerWithSave20() {

        PricingService service = new PricingService();

        double result = service.calculateFinalPrice(
                new double[] { 200 },
                new int[] { 1 },
                CustomerType.VIP,
                "SAVE20");

        assertEquals(172.5, result, 0.1);
    }
}