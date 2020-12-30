package pe.com.compartamos.mantenimiento.business;

import pe.com.compartamos.mantenimiento.expose.request.BancoRequest;
import pe.com.compartamos.mantenimiento.expose.request.OrdenRequest;
import pe.com.compartamos.mantenimiento.expose.request.SucursalRequest;
import pe.com.compartamos.mantenimiento.expose.response.Response;

public interface BancoService {

	Response registrarBanco(BancoRequest request);
	
	Response registrarSucursal(SucursalRequest request);
	
	Response registrarOrden(OrdenRequest request);
}
