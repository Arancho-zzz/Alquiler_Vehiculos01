package co.edu.ue.dao;

import java.util.List;
import co.edu.ue.model.StatusCliente;
import co.edu.ue.repository.IStatusCliente;

public class StatusClienteDao implements IStatusCliente {

	@Override
	public List<StatusCliente> addStatus(StatusCliente status) {
		return null;
	}

	@Override
	public StatusCliente uppStatus(StatusCliente status) {
		return null;
	}

	@Override
	public List<StatusCliente> getAllStatus() {
		return null;
	}

	@Override
	public boolean deleteStatusById(int id) {
		return false;
	}

	@Override
	public StatusCliente save(StatusCliente status) {
		return null;
	}

	@Override
	public StatusCliente findById(int id) {
		return null;
	}

	@Override
	public List<StatusCliente> findAll() {
		return null;
	}

}