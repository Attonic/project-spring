package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducutRepository extends JpaRepository<Product, Long> {
}
