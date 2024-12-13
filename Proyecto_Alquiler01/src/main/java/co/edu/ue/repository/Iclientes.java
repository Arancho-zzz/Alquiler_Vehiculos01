package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Cliente;
@Repository

public interface Iclientes {
	
	//añadir clientes
List<Cliente>addCliente(Cliente cliente);
//actualizar cliente
Cliente uppCliente(Cliente cliente);
  //traer los clientes con su id
List<Cliente>getallCliente();
Cliente getidCliente(int id);
 
//borrar si existe 
 boolean deleteClienteById(int id);
 boolean existsById(int id);
List<Cliente> findAll();
Cliente save(Cliente cliente);

Cliente findById(int id);

}