package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the vehiculos database table.
 * 
 */
@Entity
@Table(name="vehiculos")
@NamedQuery(name="Vehiculo.findAll", query="SELECT v FROM Vehiculo v")
public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehiculosID;

	private String color;

	private String modelo;

	private String placa;

	//bi-directional many-to-one association to Alquiler
	@OneToMany(mappedBy="vehiculo")
	private List<Alquiler> alquilers;

	//bi-directional many-to-one association to StatusVehiculo
	@ManyToOne
	@JoinColumn(name="statusID")
	private StatusVehiculo statusVehiculo;

	public Vehiculo() {
	}

	public int getVehiculosID() {
		return this.vehiculosID;
	}

	public void setVehiculosID(int vehiculosID) {
		this.vehiculosID = vehiculosID;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public List<Alquiler> getAlquilers() {
		return this.alquilers;
	}

	public void setAlquilers(List<Alquiler> alquilers) {
		this.alquilers = alquilers;
	}

	public Alquiler addAlquiler(Alquiler alquiler) {
		getAlquilers().add(alquiler);
		alquiler.setVehiculo(this);

		return alquiler;
	}

	public Alquiler removeAlquiler(Alquiler alquiler) {
		getAlquilers().remove(alquiler);
		alquiler.setVehiculo(null);

		return alquiler;
	}

	public StatusVehiculo getStatusVehiculo() {
		return this.statusVehiculo;
	}

	public void setStatusVehiculo(StatusVehiculo statusVehiculo) {
		this.statusVehiculo = statusVehiculo;
	}

}