package com.miragic.service.impl;

import com.miragic.dao.PaymentDao;
import com.miragic.entities.Payment;
import com.miragic.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public Map<String, Object> getTest(Long id) {
        return paymentDao.getTest(id);
    }
}
