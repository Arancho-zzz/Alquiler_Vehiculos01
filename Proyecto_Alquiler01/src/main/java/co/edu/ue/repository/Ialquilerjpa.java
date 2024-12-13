package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Alquiler;

public interface Ialquilerjpa extends JpaRepository<Alquiler, Integer> {
	

}