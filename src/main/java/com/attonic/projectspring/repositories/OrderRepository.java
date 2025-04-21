package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
