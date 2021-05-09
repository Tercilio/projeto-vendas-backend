package com.tercilio.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tercilio.vendas.dto.SaleSuccessDTO;
import com.tercilio.vendas.dto.SaleSumDTO;
import com.tercilio.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	//CONSULTA AGRUPADA
	@Query("SELECT new com.tercilio.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.tercilio.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
