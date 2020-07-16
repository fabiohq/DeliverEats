package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadoubicacion;

public interface IEstadoUbicacionServ {
	
	public Estadoubicacion getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadoubicacion save(Estadoubicacion entity) throws Exception;
	
	public List<Estadoubicacion> saveAll(List<Estadoubicacion> entities) throws Exception;
	
	public Estadoubicacion update(Estadoubicacion entity) throws Exception;
	
	public List<Estadoubicacion> updateAll(List<Estadoubicacion> entities) throws Exception;
	
	public void delete(Estadoubicacion entity) throws Exception;
	
	public void deleteAll(List<Estadoubicacion> entities) throws Exception;
}
