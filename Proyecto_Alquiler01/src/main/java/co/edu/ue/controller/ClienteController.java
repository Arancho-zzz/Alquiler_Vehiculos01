package co.edu.ue.controller;

import co.edu.ue.model.Cliente;
import co.edu.ue.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllCliente();
    }

    // Obtener un cliente por ID
    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return clienteService.getClienteById(id);
    }

    // Crear o actualizar un cliente
    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.addCliente(cliente);
    }

    // Eliminar un cliente por ID
    @DeleteMapping("/{id}")
    public boolean deleteCliente(@PathVariable int id) {
        return clienteService.deleteCliente(id);
    }
}