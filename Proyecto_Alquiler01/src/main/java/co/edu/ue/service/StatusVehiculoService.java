package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.StatusVehiculo;
import co.edu.ue.repository.Istatusvehiculo;

@Service
public class StatusVehiculoService {

    @Autowired
    private Istatusvehiculo statusvehiculoRepository;

    public List<StatusVehiculo> obtenerTodosLosStatus() {
        return statusvehiculoRepository.findAll();
    }

    public StatusVehiculo guardarStatus(StatusVehiculo status) {
        return statusvehiculoRepository.save(status);
    }

    public void eliminarStatus(Integer id) {
    	statusvehiculoRepository.deleteStatusById(id);
    }

}