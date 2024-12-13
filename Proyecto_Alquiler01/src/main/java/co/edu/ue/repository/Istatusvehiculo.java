package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.StatusVehiculo;

@Repository
public interface Istatusvehiculo {

    List<StatusVehiculo> addStatus(StatusVehiculo status);

    StatusVehiculo uppStatus(StatusVehiculo status);

    List<StatusVehiculo> getAllStatus();

    boolean deleteStatusById(int id);

    StatusVehiculo save(StatusVehiculo status);

    StatusVehiculo findById(int id);

	List<StatusVehiculo> findAll();
}