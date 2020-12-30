package pe.com.compartamos.mantenimiento.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.compartamos.mantenimiento.repository.BancoRespository;
import pe.com.compartamos.mantenimiento.business.BancoService;
import pe.com.compartamos.mantenimiento.expose.request.BancoRequest;
import pe.com.compartamos.mantenimiento.expose.request.OrdenRequest;
import pe.com.compartamos.mantenimiento.expose.request.SucursalRequest;
import pe.com.compartamos.mantenimiento.expose.response.Response;
import pe.com.compartamos.mantenimiento.model.Banco;
import pe.com.compartamos.mantenimiento.model.OrdenesPago;
import pe.com.compartamos.mantenimiento.model.Sucursales;

@Service
public class BancoServiceImpl implements BancoService {

	@Autowired
	private BancoRespository bancoRespository;
	
	@Override
	public Response registrarBanco(BancoRequest request) {
		Response response = new Response();
		Banco banco = new Banco();
		try {
			banco.setNombre(request.getNombre());
			banco.setDireccion(request.getDireccion());
			banco.setFechaRegistro(request.getFechaRegistro());
			
			response = bancoRespository.registraBanco(banco);
		}catch (Exception e) {
			System.out.println("nombre: " + e.getMessage());
		} finally {
			System.out.println(response.toString());
		}
		return response;
	}

	@Override
	public Response registrarSucursal(SucursalRequest request) {
		Response response = new Response();
		Banco banco = new Banco();
		Sucursales sucursal = new Sucursales();
		try {
			banco = bancoRespository.getBancoById(request.getIdBanco());			
			if(banco != null) {
				System.out.println("banco Entity: " + banco.toString());
				sucursal.setBanco(banco);
				sucursal.setNombre(request.getNombre());
				sucursal.setDireccion(request.getDireccion());
				sucursal.setFechaRegistro(request.getFechaRegistro());
				response = bancoRespository.registraSucursal(sucursal);
			} else {
				response.setCodigoRespuesta("2");
				response.setDescripcionRespuesta("No se encontro ningun banco con el Id:" + request.getIdBanco());
			}
		} catch (Exception e) {
			System.out.println("nombre: " + e.getMessage());
		} finally {
			System.out.println(response.toString());
		}
		return response;
	}

	@Override
	public Response registrarOrden(OrdenRequest request) {
		Response response = new Response();
		Sucursales sucursal = new Sucursales();
		OrdenesPago orden = new OrdenesPago();
		try {
			sucursal = bancoRespository.getSucursalById(request.getIdSucursal());
			if(sucursal != null) {
				System.out.println("sucursal Entity: " + sucursal.toString());
				orden.setSucursal(sucursal);
				orden.setMonto(request.getMonto());
				orden.setMoneda(request.getMoneda());
				orden.setEstado(request.getEstado());
				orden.setFechaRegistro(request.getFechaRegistro());
				response = bancoRespository.registraOrden(orden);
			} else {
				response.setCodigoRespuesta("2");
				response.setDescripcionRespuesta("No se encontro ninguna sucursal con el Id:" + request.getIdSucursal());
			}
		} catch (Exception e) {
			System.out.println("nombre: " + e.getMessage());
		} finally {
			System.out.println(response.toString());
		}
		return response;
	}

}
