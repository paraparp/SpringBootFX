package com.paraparp.javafx.service;

import java.util.List;

import com.paraparp.javafx.model.entity.Cliente;


public interface IClienteService {

	
	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findById(Long id);
	public void delete(Long id);
}
