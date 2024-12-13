package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Cliente;
import co.edu.ue.repository.Iclientes;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private Iclientes clienteRepository;

    // Añadir un cliente
    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente); 
    }

    // Actualizar un cliente (igual que añadir, usa save)
    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.uppCliente(cliente); 
        // Actualiza si ya existe, crea si no
    }

    // Obtener todos los clientes
    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll(); // Devuelve todos los clientes
    }

    // Obtener un cliente por ID
    public Cliente getClienteById(int id) {
        return clienteRepository.findById(id); 
    }

    // Eliminar un cliente por ID
    public boolean deleteCliente(int id) {
        if (clienteRepository.existsById(id)) { 
        	// Elimina el cliente si existe
            clienteRepository.deleteClienteById(id);
            return true;
        }
        return false; 
    }
}