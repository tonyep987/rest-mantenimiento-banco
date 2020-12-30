package pe.com.compartamos.mantenimiento.expose.request;

import java.util.Date;

public class OrdenRequest {
	private Integer idOrden;
	private Double monto;
	private String moneda;
	private Integer estado;
	private Date fechaRegistro;
	private Integer idSucursal;
	
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
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	@Override
	public String toString() {
		return "OrdenRequest [idOrden=" + idOrden + ", monto=" + monto + ", moneda=" + moneda + ", estado=" + estado
				+ ", fechaRegistro=" + fechaRegistro + ", idSucursal=" + idSucursal + "]";
	}
	
	
}
