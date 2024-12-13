package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Vehiculo;
import co.edu.ue.repository.Ivehiculos;

public class VehiculoDao implements Ivehiculos {
Ivehiculos jpa;
	@Override
	public List<Vehiculo> addVehiculos(Vehiculo Vehiculos) {
		jpa.save(Vehiculos);// TODO Auto-generated method stub
		return getallVehiculos();
	}
//
	@Override
	public Vehiculo uppVehiculo(Vehiculo vehiculos) {
		// TODO Auto-generated method stub
		return save(vehiculos);
	}

	@Override
	public List<Vehiculo> getallVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo getidVehiculo(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public boolean deleteVehiculoById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}