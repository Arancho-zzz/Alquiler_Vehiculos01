package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Pago;
import co.edu.ue.repository.Ipago;

import java.util.List;

@Service
public class PagoService {

    @Autowired
    private Ipago pagoRepository;

    // Añadir un pago
    public Pago addPago(Pago pago) {
        return pagoRepository.save(pago); // Guarda el pago en la base de datos
    }

    // Actualizar un pago
    public Pago updatePago(Pago pago) {
        // Usa save para actualizar o crear
    	return pagoRepository.save(pago); 
    }

    // Obtener todos los pagos
    public List<Pago> getAllPagos() {
    	 // Devuelve todos los pagos
        return pagoRepository.findAll();
    }

    // Obtener un pago por ID
    public Pago getPagoById(int id) {
       // Devuelve el pago si existe
    	return (Pago) pagoRepository.findById(id); 
    }

    // Eliminar un pago por ID
    public boolean deletePago(int id) {
        if (pagoRepository.existsById(id)) { 
            pagoRepository.deleteById(id); // Elimina el pago si existe
            return true;
        }
        return false; // Si no existe, devuelve false
    }
}