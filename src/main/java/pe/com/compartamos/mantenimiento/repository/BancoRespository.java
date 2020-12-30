package pe.com.compartamos.mantenimiento.repository;

import pe.com.compartamos.mantenimiento.expose.response.Response;
import pe.com.compartamos.mantenimiento.model.Banco;
import pe.com.compartamos.mantenimiento.model.OrdenesPago;
import pe.com.compartamos.mantenimiento.model.Sucursales;

public interface BancoRespository {

	Response registraBanco(Banco request);
	
	Response registraSucursal(Sucursales request);
	
	Response registraOrden(OrdenesPago request);
	
	Banco getBancoById(Integer idBanco);
	
	Sucursales getSucursalById(Integer idSucursal);
}
