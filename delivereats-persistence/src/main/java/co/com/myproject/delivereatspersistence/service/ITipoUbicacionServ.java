package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipoubicacion;

public interface ITipoUbicacionServ {
	
	public Tipoubicacion getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipoubicacion save(Tipoubicacion entity) throws Exception;
	
	public List<Tipoubicacion> saveAll(List<Tipoubicacion> entities) throws Exception;
	
	public Tipoubicacion update(Tipoubicacion entity) throws Exception;
	
	public List<Tipoubicacion> updateAll(List<Tipoubicacion> entities) throws Exception;
	
	public void delete(Tipoubicacion entity) throws Exception;
	
	public void deleteAll(List<Tipoubicacion> entities) throws Exception;
}
