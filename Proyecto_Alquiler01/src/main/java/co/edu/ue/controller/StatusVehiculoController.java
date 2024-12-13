package co.edu.ue.controller;

import co.edu.ue.model.StatusVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/status")
public class StatusVehiculoController {

    private static final String id = "id";
	@Autowired
    private StatusVehiculoController statusService;

    @GetMapping
    public List<StatusVehiculo> obtenerTodosLosStatus() {
        return statusService.obtenerTodosLosStatus();
    }

    @PostMapping
    public StatusVehiculo guardarStatus(@RequestBody StatusVehiculo status) {
        return statusService.guardarStatus(status);
    }

    @DeleteMapping("/{id}")
    public void eliminarStatus(@PathVariable(id) Integer id) {
        statusService.eliminarStatus(id);
    }
}
