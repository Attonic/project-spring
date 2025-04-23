package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.OrderItens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItens, Long> {
}
