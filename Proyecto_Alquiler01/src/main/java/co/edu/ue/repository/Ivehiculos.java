package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Vehiculo;
@Repository

public interface Ivehiculos {
	
	//añadir vehiculos
List<Vehiculo>addVehiculos(Vehiculo Vehiculos);
//actualizar vehiculos
Vehiculo uppVehiculo(Vehiculo vehiculos);
  //traer los vehiculos con su id
List<Vehiculo>getallVehiculos();
Vehiculo getidVehiculo(int id);
 
//borrar si existe 
 boolean deleteVehiculoById(int id);
 boolean existsById(int id);
List<Vehiculo> findAll();
Vehiculo save(Vehiculo vehiculo);

Vehiculo findById(int id);

}