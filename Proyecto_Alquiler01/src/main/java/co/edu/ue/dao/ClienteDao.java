package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Cliente;
import co.edu.ue.repository.Iclientes;

public class ClienteDao implements Iclientes{
Iclientes jpa;
	@Override
	public List<Cliente> addCliente(Cliente cliente) {
		jpa.save(cliente);// TODO Auto-generated method stub
		return getallCliente();
	}

	@Override
	public Cliente uppCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return save(cliente);
	}

	@Override
	public List<Cliente> getallCliente() {
		// TODO Auto-generated method stub
		return getallCliente();
	}

	@Override
	public Cliente getidCliente(int id) {
		// TODO Auto-generated method stub
		return getidCliente(id);
	}

	@Override
	public boolean deleteClienteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}