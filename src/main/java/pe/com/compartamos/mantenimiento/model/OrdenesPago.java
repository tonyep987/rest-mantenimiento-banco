package pe.com.compartamos.mantenimiento.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ordenes_pago")
public class OrdenesPago implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idorden")
	private Integer idOrden;
	
	@Column(name = "monto")
	private Double monto;
	
	@Column(name = "moneda")
	private String moneda;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "fecharegistro")
	private Date fechaRegistro;

	@ManyToOne
	@JoinColumn(name = "idsucursal")
	private Sucursales sucursal;

	public Integer getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Sucursales getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursales sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "OrdenesPago [idOrden=" + idOrden + ", monto=" + monto + ", moneda=" + moneda + ", estado=" + estado
				+ ", fechaRegistro=" + fechaRegistro + ", sucursal=" + sucursal + "]";
	}
	
	
}
