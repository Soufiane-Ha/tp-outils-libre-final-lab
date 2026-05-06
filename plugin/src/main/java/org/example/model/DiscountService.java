package org.example.model;

public class DiscountService {

    public double calculateDiscount(
            double subtotal,
            CustomerType customerType,
            String discountCode) {

        double discount = 0;

        switch (discountCode) {

            case "SAVE10":
                discount += subtotal * 0.10;
                break;

            case "SAVE20":
                discount += subtotal * 0.20;
                break;
        }

        if (customerType == CustomerType.VIP) {
            discount += subtotal * 0.05;
        }

        return discount;
    }
}