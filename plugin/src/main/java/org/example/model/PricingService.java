package org.example.model;

public class PricingService {

    private final DiscountService discountService;
    private final TaxService taxService;

    public PricingService() {
        this.discountService = new DiscountService();
        this.taxService = new TaxService();
    }

    public double calculateFinalPrice(
            double[] prices,
            int[] quantities,
            CustomerType customerType,
            String discountCode) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * quantities[i];
        }

        double discount = discountService.calculateDiscount(
                subtotal,
                customerType,
                discountCode);

        double taxableAmount = subtotal - discount;

        double tax = taxService.calculateTax(taxableAmount);

        return taxableAmount + tax;
    }
}