package com.salin.ecommerce.payment;

import com.salin.ecommerce.customer.CustomerResponse;
import com.salin.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
