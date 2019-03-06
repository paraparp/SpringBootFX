package com.paraparp.javafx.model.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.paraparp.javafx.model.entity.Cliente;



public interface IClienteDao extends JpaRepository<Cliente, Long> {


	
	
	

	//CRUDREPOSITORY crea las consultas genericas por nosotros sin necesidad de implementar un DAO
	
//	public List<Cliente> findAll();
//	public void save(Cliente cliente);
//	public Cliente finById(Long id);
//	public void delete(Long id);
}
