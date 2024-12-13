package co.edu.ue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Alquiler;
import co.edu.ue.repository.Ialquiler;

@Service
public class AlquilerService {

	    @Autowired
	    private Ialquiler alquilerRepository;

	    public Alquiler addAlquiler(Alquiler alquiler) {
	        return alquilerRepository.save(alquiler);
	    }

	    public Alquiler updateAlquiler(Alquiler alquiler) {
	        return alquilerRepository.save(alquiler);
	    }

	    public List<Alquiler> getAllAlquiler() {
	        return alquilerRepository.findAll();
	    }

	    public Alquiler getAlquilerById(int id) {
	        Optional<Alquiler> optionalAlquiler = alquilerRepository.findById(id);
	        return optionalAlquiler.orElse(null); // Handle optional gracefully
	    }

	    public boolean deleteAlquiler(int id) {
	        if (alquilerRepository.existsById(id)) {
	            alquilerRepository.deleteAlquilerById(id); // Use standard method
	            return true;
	        }
	        return false;
	    }
	}