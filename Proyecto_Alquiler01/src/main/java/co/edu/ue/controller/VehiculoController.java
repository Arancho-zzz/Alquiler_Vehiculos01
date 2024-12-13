package co.edu.ue.controller;

import co.edu.ue.model.Vehiculo;
import co.edu.ue.service.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    // Obtener un vehículo por ID
    @GetMapping("/{id}")
    public Vehiculo getVehiculoById(@PathVariable int id) {
        return vehiculoService.getVehiculoById(id);
    }

    // Crear o actualizar un vehículo
    @PostMapping
    public Vehiculo addVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.addVehiculo(vehiculo);
    }

    // Eliminar un vehículo por ID
    @DeleteMapping("/{id}")
    public boolean deleteVehiculo(@PathVariable int id) {
        return vehiculoService.deleteVehiculo(id);
    }
    
}