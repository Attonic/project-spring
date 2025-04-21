package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
