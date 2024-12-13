package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the status_cliente database table.
 * 
 */
@Entity
@Table(name="status_cliente")
@NamedQuery(name="StatusCliente.findAll", query="SELECT s FROM StatusCliente s")
public class StatusCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusID;

	private String descripcion;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="statusCliente")
	private List<Cliente> clientes;

	public StatusCliente() {
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

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setStatusCliente(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setStatusCliente(null);

		return cliente;
	}

}