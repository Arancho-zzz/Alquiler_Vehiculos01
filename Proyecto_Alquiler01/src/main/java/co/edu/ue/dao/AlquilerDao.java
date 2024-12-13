package co.edu.ue.dao;

import java.util.List;
import java.util.Optional;

import co.edu.ue.model.Alquiler;
import co.edu.ue.model.Vehiculo;
import co.edu.ue.repository.Ialquiler;

public class AlquilerDao implements Ialquiler{
 Ialquiler jpa;
	@Override
	public List<Alquiler> addAlquiler(Alquiler alquiler) {
		jpa.save(alquiler);
		return getallAlquiler();
	}

	@Override
	public Alquiler uppAlquiler(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return save(alquiler);
	}

	@Override
	public Alquiler addAlquiler1(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> getallAlquiler() {
		// TODO Auto-generated method stub
		return getallAlquiler();
	}

	@Override
	public Alquiler getidAlquiler(int id) {
		// TODO Auto-generated method stub
		return getidAlquiler(id);
	}

	@Override
	public boolean deleteAlquilerById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Alquiler> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public Alquiler save(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Alquiler> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Alquiler> findById(Vehiculo vehiculoId, boolean b) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Alquiler> findByVehiculoAndActivo(String vehiculoId, boolean b) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}