package com.tercilio.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tercilio.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
