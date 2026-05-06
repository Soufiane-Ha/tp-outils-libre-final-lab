package org.example;

public class PricingEngine {

    public double calculate(
            double[] prices,
            int[] quantities,
            String customerType,
            String discountCode) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * quantities[i];
        }

        double discount = 0;

        if (discountCode.equals("SAVE10")) {
            discount = subtotal * 0.10;
        }

        if (discountCode.equals("SAVE20")) {
            discount = subtotal * 0.20;
        }

        if (customerType.equals("VIP")) {
            discount += subtotal * 0.05;
        }

        double tax = (subtotal - discount) * 0.15;

        return subtotal - discount + tax;
    }
}