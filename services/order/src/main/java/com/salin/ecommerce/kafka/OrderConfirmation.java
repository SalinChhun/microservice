package com.salin.ecommerce.kafka;

import com.salin.ecommerce.customer.CustomerResponse;
import com.salin.ecommerce.order.PaymentMethod;
import com.salin.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
