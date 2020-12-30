package pe.com.compartamos.mantenimiento;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import pe.com.compartamos.mantenimiento.business.BancoService;
import pe.com.compartamos.mantenimiento.expose.request.BancoRequest;
import pe.com.compartamos.mantenimiento.expose.request.OrdenRequest;
import pe.com.compartamos.mantenimiento.expose.request.SucursalRequest;

@Controller
@Path("/mantenimiento/v1")
public class BancoController {

	@Autowired
	private BancoService bancoService;
	
	@POST
	@Path("/registra-banco")
	@Produces({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
    @Consumes({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
	public Response registrarBanco(@RequestBody BancoRequest request) {
		pe.com.compartamos.mantenimiento.expose.response.Response resp = new pe.com.compartamos.mantenimiento.expose.response.Response(); 	
		resp = bancoService.registrarBanco(request);
		return Response.ok(resp).build();
	}
	
	@POST
	@Path("/registra-sucursal")
	@Produces({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
    @Consumes({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
	public Response registrarSucursal(@RequestBody SucursalRequest request) {
		pe.com.compartamos.mantenimiento.expose.response.Response resp = new pe.com.compartamos.mantenimiento.expose.response.Response(); 
		resp = bancoService.registrarSucursal(request);
		return Response.ok(resp).build();
	}
	
	@POST
	@Path("/registra-orden")
	@Produces({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
    @Consumes({"application/json; charset=UTF-8","*/*;charset=UTF-8"})
	public Response registrarOrden(@RequestBody OrdenRequest request) {
		pe.com.compartamos.mantenimiento.expose.response.Response resp = new pe.com.compartamos.mantenimiento.expose.response.Response(); 	
		resp = bancoService.registrarOrden(request);
		return Response.ok(resp).build();
	}
}
