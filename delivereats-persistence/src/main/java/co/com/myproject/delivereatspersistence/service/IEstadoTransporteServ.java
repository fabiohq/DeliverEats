package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadotransporte;

public interface IEstadoTransporteServ {

	public Estadotransporte getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadotransporte save(Estadotransporte entity) throws Exception;
	
	public List<Estadotransporte> saveAll(List<Estadotransporte> entities) throws Exception;
	
	public Estadotransporte update(Estadotransporte entity) throws Exception;
	
	public List<Estadotransporte> updateAll(List<Estadotransporte> entities) throws Exception;
	
	public void delete(Estadotransporte entity) throws Exception;
	
	public void deleteAll(List<Estadotransporte> entities) throws Exception;
}
