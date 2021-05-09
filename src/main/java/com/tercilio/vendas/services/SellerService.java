package com.tercilio.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tercilio.vendas.dto.SellerDTO;
import com.tercilio.vendas.entities.Seller;
import com.tercilio.vendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> seller =  repository.findAll();
		
		return seller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
