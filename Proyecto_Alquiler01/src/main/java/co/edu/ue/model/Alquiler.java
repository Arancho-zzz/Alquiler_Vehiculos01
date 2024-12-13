package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the alquiler database table.
 * 
 */
@Entity
@NamedQuery(name="Alquiler.findAll", query="SELECT a FROM Alquiler a")
public class Alquiler implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int alquilerID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_alquiler")
	private Date fechaAlquiler;

	//bi-directional many-to-one association to Pago
	@ManyToOne
	@JoinColumn(name="pagoID")
	private Pago pago;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="clienteID")
	private Cliente cliente;

	//bi-directional many-to-one association to Vehiculo
	@ManyToOne
	@JoinColumn(name="vehiculosID")
	private Vehiculo vehiculo;

	public Alquiler() {
	}

	public int getAlquilerID() {
		return this.alquilerID;
	}

	public void setAlquilerID(int alquilerID) {
		this.alquilerID = alquilerID;
	}

	public Date getFechaAlquiler() {
		return this.fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Pago getPago() {
		return this.pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}