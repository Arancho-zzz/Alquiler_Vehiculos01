package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Vehiculo;
import co.edu.ue.repository.Ivehiculos;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private Ivehiculos vehiculoRepository;

    // Añadir un vehículo
    public Vehiculo addVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo); 
    }

    // Actualizar un vehículo (igual que añadir, usa save)
    public Vehiculo updateVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.uppVehiculo(vehiculo); 
        // Actualiza si ya existe, crea si no
    }

    // Obtener todos los vehículos
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll(); // Devuelve todos los vehículos
    }

    // Obtener un vehículo por ID
    public Vehiculo getVehiculoById(int id) {
        return vehiculoRepository.findById(id);
    }

    // Eliminar un vehículo por ID
    public boolean deleteVehiculo(int id) {
        if (vehiculoRepository.existsById(id)) { 
        	// Elimina el vehículo si existe
            vehiculoRepository.deleteVehiculoById(id);
            return true;
        }
        return false; 
    }
}