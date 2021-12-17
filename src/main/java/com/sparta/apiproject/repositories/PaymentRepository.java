package com.sparta.apiproject.repositories;

import com.sparta.apiproject.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
