package com.billingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.billingSystem.Entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

}
