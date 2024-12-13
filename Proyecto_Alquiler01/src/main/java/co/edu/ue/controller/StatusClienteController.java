package co.edu.ue.controller;

import co.edu.ue.model.StatusCliente;
import co.edu.ue.service.StatusClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/status")
public class StatusClienteController {

    private static final String id = "id";
	@Autowired
    private StatusClienteService statusService;

    @GetMapping
    public List<StatusCliente> obtenerTodosLosStatus() {
        return statusService.obtenerTodosLosStatus();
    }

    @PostMapping
    public StatusCliente guardarStatus(@RequestBody StatusCliente status) {
        return statusService.guardarStatus(status);
    }

    @DeleteMapping("/{id}")
    public void eliminarStatus(@PathVariable(id) Integer id) {
        statusService.eliminarStatus(id);
    }
}

