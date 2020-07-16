package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipotransporte;

public interface ITipoTransporteServ {
	
	public Tipotransporte getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipotransporte save(Tipotransporte entity) throws Exception;
	
	public List<Tipotransporte> saveAll(List<Tipotransporte> entities) throws Exception;
	
	public Tipotransporte update(Tipotransporte entity) throws Exception;
	
	public List<Tipotransporte> updateAll(List<Tipotransporte> entities) throws Exception;
	
	public void delete(Tipotransporte entity) throws Exception;
	
	public void deleteAll(List<Tipotransporte> entities) throws Exception;
}
