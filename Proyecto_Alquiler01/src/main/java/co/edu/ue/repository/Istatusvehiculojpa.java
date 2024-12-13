package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.StatusVehiculo;

public interface Istatusvehiculojpa extends JpaRepository<StatusVehiculo, Integer> {
	
}