package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Pago;
@Repository
public interface Ipago {
List<Pago>addPagos(Pago pagos);
//actualizar
Pago uppPago(Pago pagos);
//traer pagos
List<Pago>getPagos();
Pago getidPago(int id);

List<Pago> findAll();

Pago save(Pago pago);

boolean existsById(int id);

Object findById(int id);

void deleteById(int id);

}