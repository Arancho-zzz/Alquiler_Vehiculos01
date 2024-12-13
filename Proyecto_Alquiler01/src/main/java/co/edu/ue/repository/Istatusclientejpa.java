package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.StatusCliente;

public interface Istatusclientejpa extends JpaRepository<StatusCliente, Integer> {
	
}