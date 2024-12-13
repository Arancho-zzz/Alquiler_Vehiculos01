package co.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Alquiler;
import co.edu.ue.model.Vehiculo;

@Repository 
public interface Ialquiler {
	
	//añadir Alquiler
List<Alquiler>addAlquiler(Alquiler alquiler);
Alquiler uppAlquiler(Alquiler alquiler);
//actualizar Alquiler
Alquiler addAlquiler1(Alquiler alquiler);
  //traer Alquiler con su id
List<Alquiler>getallAlquiler();
Alquiler getidAlquiler(int id);
 
//borrar si existe 
 boolean deleteAlquilerById(int id);
 boolean existsById(int id);
List<Alquiler> findAll();
Alquiler save(Alquiler alquiler);

Optional<Alquiler> findById(int id);
Optional<Alquiler> findById(Vehiculo vehiculoId, boolean b);
Optional<Alquiler> findByVehiculoAndActivo(String vehiculoId, boolean b);

}