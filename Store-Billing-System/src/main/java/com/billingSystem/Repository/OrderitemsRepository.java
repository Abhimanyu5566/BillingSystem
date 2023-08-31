package com.billingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billingSystem.Entity.OrderItems;

@Repository
public interface OrderitemsRepository extends JpaRepository<OrderItems, Integer> {
	

}
