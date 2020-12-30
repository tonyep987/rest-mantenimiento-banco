package pe.com.compartamos.mantenimiento.repository.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.com.compartamos.mantenimiento.expose.response.Response;
import pe.com.compartamos.mantenimiento.model.Banco;
import pe.com.compartamos.mantenimiento.model.OrdenesPago;
import pe.com.compartamos.mantenimiento.model.Sucursales;
import pe.com.compartamos.mantenimiento.repository.BancoRespository;

@Repository
public class BancoRespositoryImpl implements BancoRespository {

	private static final EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNIT_NAME = "JPA-CON";
    
    static {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }
 
    EntityManager entityMgr = getEntityManager();
	
	@Override
	public Response registraBanco(Banco request) {
		Response response = new Response();
		try {
			System.out.println("registraBanco request: " + request.toString());
			
			entityMgr.getTransaction().begin();
			
			entityMgr.persist(request);
			System.out.println("persist");
			entityMgr.getTransaction().commit();
			//entityMgr.close();
			response.setCodigoRespuesta("0");
			response.setDescripcionRespuesta("Banco guardado con éxito");
		} catch (Exception e) {
			response.setCodigoRespuesta("1");
			response.setDescripcionRespuesta("Error al guardar Banco: " + e.getMessage());
			System.out.println("registraBanco: " + e.getMessage());
		} finally {
			System.out.println(response.toString());
		}
		return response;
	}

	@Override
	public Response registraSucursal(Sucursales request) {
		Response response = new Response();
		try {
			System.out.println("registraSucursal request: " + request.toString());
            entityMgr.getTransaction().begin();
			
			entityMgr.persist(request);
			System.out.println("persist");
			entityMgr.getTransaction().commit();
			response.setCodigoRespuesta("0");
			response.setDescripcionRespuesta("Sucursal guardada con éxito");
		} catch (Exception e) {
			response.setCodigoRespuesta("1");
			response.setDescripcionRespuesta("Error al guardar Sucursal: " + e.getMessage());
			System.out.println("registraSucursal: " + e.getMessage());
		} finally {
			//entityMgr.close();
			System.out.println(response.toString());
		}
		return response;
	}

	@Override
	public Response registraOrden(OrdenesPago request) {
		Response response = new Response();
		try {
			System.out.println("registraOrden request: " + request.toString());
            entityMgr.getTransaction().begin();
			
			entityMgr.persist(request);
			System.out.println("persist");
			entityMgr.getTransaction().commit();		
			response.setCodigoRespuesta("0");
			response.setDescripcionRespuesta("Orden de pago guardada con éxito");
		} catch (Exception e) {
			response.setCodigoRespuesta("1");
			response.setDescripcionRespuesta("Error al guardar Orden de pago: " + e.getMessage());
			System.out.println("registraOrden: " + e.getMessage());
		} finally {
			//entityMgr.close();
			System.out.println(response.toString());
		}
		return response;
	}

	@Override
	public Banco getBancoById(Integer idBanco) {
		Banco bancoEntity = new Banco();
		Query qBancoById;
		try {
			qBancoById = entityMgr.createQuery("FROM Banco as kb WHERE kb.idBanco= :idBanco")
					.setParameter("idBanco", idBanco);
			List results = qBancoById.getResultList();
			if (!results.isEmpty()) {
				bancoEntity = (Banco) results.get(0);
			} else {
				bancoEntity = null;
			}
		}catch (Exception e) {
			System.out.println("getBancoById: " + e.getMessage());
		}
		return bancoEntity;
	}

	@Override
	public Sucursales getSucursalById(Integer idSucursal) {
		Sucursales sucursalEntity = new Sucursales();
		Query qsucursalById;
		try {
			qsucursalById = entityMgr.createQuery("FROM Sucursales as ks WHERE ks.idSucursal= :idSucursal")
					.setParameter("idSucursal", idSucursal);
			List results = qsucursalById.getResultList();
			if (!results.isEmpty()) {
				sucursalEntity = (Sucursales) results.get(0);
			} else {
				sucursalEntity = null;
			}
		}catch (Exception e) {
			System.out.println("getSucursalById: " + e.getMessage());
		}
		return sucursalEntity;
	}

}
