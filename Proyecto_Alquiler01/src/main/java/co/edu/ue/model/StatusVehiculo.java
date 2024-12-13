package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the status_vehiculo database table.
 * 
 */
@Entity
@Table(name="status_vehiculo")
@NamedQuery(name="StatusVehiculo.findAll", query="SELECT s FROM StatusVehiculo s")
public class StatusVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusID;

	private String descripcion;

	//bi-directional many-to-one association to Vehiculo
	@OneToMany(mappedBy="statusVehiculo")
	private List<Vehiculo> vehiculos;

	public StatusVehiculo() {
	}

	public int getStatusID() {
		return this.statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Vehiculo addVehiculo(Vehiculo vehiculo) {
		getVehiculos().add(vehiculo);
		vehiculo.setStatusVehiculo(this);

		return vehiculo;
	}

	public Vehiculo removeVehiculo(Vehiculo vehiculo) {
		getVehiculos().remove(vehiculo);
		vehiculo.setStatusVehiculo(null);

		return vehiculo;
	}

}