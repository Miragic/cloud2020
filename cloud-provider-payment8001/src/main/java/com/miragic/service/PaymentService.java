package com.miragic.service;

import com.miragic.entities.Payment;

public interface PaymentService {

    /**
     * 创建payment
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id获取payment
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
