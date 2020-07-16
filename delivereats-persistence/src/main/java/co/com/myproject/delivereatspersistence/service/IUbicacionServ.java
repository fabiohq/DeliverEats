package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Ubicacion;

public interface IUbicacionServ {
	
	public Ubicacion getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Ubicacion save(Ubicacion entity) throws Exception;
	
	public List<Ubicacion> saveAll(List<Ubicacion> entities) throws Exception;
	
	public Ubicacion update(Ubicacion entity) throws Exception;
	
	public List<Ubicacion> updateAll(List<Ubicacion> entities) throws Exception;
	
	public void delete(Ubicacion entity) throws Exception;
	
	public void deleteAll(List<Ubicacion> entities) throws Exception;
}
