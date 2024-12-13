package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.StatusCliente;
import co.edu.ue.repository.IStatusCliente;

@Service
public class StatusClienteService {

    @Autowired
    private IStatusCliente statusclienteRepository;

    public List<StatusCliente> obtenerTodosLosStatus() {
        return statusclienteRepository.findAll();
    }

    public StatusCliente guardarStatus(StatusCliente status) {
        return statusclienteRepository.save(status);
    }

    public void eliminarStatus(Integer statusId) {
    	statusclienteRepository.deleteStatusById(statusId);
    }

}