package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Pago;
import co.edu.ue.repository.Ipago;

public class PagoDao implements Ipago {
Ipago jpa;
	@Override
	public List<Pago> addPagos(Pago pagos) {
		jpa.save(pagos);// TODO Auto-generated method stub
		return getPagos();
	}

	@Override
	public Pago uppPago(Pago pagos) {
		// TODO Auto-generated method stub
		return save(pagos);
	}

	@Override
	public List<Pago> getPagos() {
		// TODO Auto-generated method stub
		return getPagos();
	}

	@Override
	public Pago getidPago(int id) {
		// TODO Auto-generated method stub
		return getidPago(id);
	}

	@Override
	public List<Pago> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public Pago save(Pago pago) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}