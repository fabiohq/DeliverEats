package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Transporte;

public interface ITransporteServ {
	
	public Transporte getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Transporte save(Transporte entity) throws Exception;
	
	public List<Transporte> saveAll(List<Transporte> entities) throws Exception;
	
	public Transporte update(Transporte entity) throws Exception;
	
	public List<Transporte> updateAll(List<Transporte> entities) throws Exception;
	
	public void delete(Transporte entity) throws Exception;
	
	public void deleteAll(List<Transporte> entities) throws Exception;
}
