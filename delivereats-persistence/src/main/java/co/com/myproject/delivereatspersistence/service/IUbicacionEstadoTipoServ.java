package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Ubicacionestadotipo;
import co.com.myproject.delivereatspersistence.entity.UbicacionestadotipoPK;

public interface IUbicacionEstadoTipoServ {
	
	public Ubicacionestadotipo getOne(UbicacionestadotipoPK id) throws Exception;
	
	public boolean existsById(UbicacionestadotipoPK id) throws Exception;
	
	public Ubicacionestadotipo save(Ubicacionestadotipo entity) throws Exception;
	
	public List<Ubicacionestadotipo> saveAll(List<Ubicacionestadotipo> entities) throws Exception;
	
	public Ubicacionestadotipo update(Ubicacionestadotipo entity) throws Exception;
	
	public List<Ubicacionestadotipo> updateAll(List<Ubicacionestadotipo> entities) throws Exception;
	
	public void delete(Ubicacionestadotipo entity) throws Exception;
	
	public void deleteAll(List<Ubicacionestadotipo> entities) throws Exception;
}
