package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Cliente;

public interface Iclientesjpa extends JpaRepository<Cliente, Integer> {

}