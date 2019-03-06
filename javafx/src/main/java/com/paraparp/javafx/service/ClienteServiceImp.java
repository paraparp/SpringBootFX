package com.paraparp.javafx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paraparp.javafx.model.dao.IClienteDao;
import com.paraparp.javafx.model.entity.Cliente;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	public Cliente findById(Long id) {
		return clienteDao.findOne(id);
	}

	public void delete(Long id) {
		clienteDao.delete(id);
		
	}
	
	
//	@Override
//	@Transactional
//	public List<Cliente> findAll() {
//	
//		return (List<Cliente>) clienteDao.findAll();
//	}
//
//	@Override
//	@Transactional
//	public void save(Cliente cliente) {
//		clienteDao.save(cliente);
//		
//	}
//
//	@Override
//	@Transactional
//	public Cliente findById(Long id) {
//	
//		return clienteDao.findById(id).orElse(null);
//	}
//
//	@Override
//	@Transactional
//	public void delete(Long id) {
//		clienteDao.deleteById(id);
//		
//	}
	
	

}
