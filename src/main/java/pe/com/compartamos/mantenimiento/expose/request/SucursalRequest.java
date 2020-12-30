package pe.com.compartamos.mantenimiento.expose.request;

import java.util.Date;

public class SucursalRequest {
    private Integer idSucursal;
	private String nombre;
	private String direccion;
	private Date fechaRegistro;
	private Integer idBanco;
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}
	
	@Override
	public String toString() {
		return "SucursalRequest [idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", fechaRegistro=" + fechaRegistro + ", idBanco=" + idBanco + "]";
	}
	
	
}
