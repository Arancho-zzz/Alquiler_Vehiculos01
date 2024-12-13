package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.StatusCliente;

@Repository
public interface IStatusCliente {

    List<StatusCliente> addStatus(StatusCliente status);

    StatusCliente uppStatus(StatusCliente status);

    List<StatusCliente> getAllStatus();

    boolean deleteStatusById(int id);

    StatusCliente save(StatusCliente status);

    StatusCliente findById(int id);

	List<StatusCliente> findAll();
}