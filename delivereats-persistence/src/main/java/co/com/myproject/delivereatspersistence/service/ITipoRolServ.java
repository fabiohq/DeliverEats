package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tiporol;

public interface ITipoRolServ {
	
	public Tiporol getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tiporol save(Tiporol entity) throws Exception;
	
	public List<Tiporol> saveAll(List<Tiporol> entities) throws Exception;
	
	public Tiporol update(Tiporol entity) throws Exception;
	
	public List<Tiporol> updateAll(List<Tiporol> entities) throws Exception;
	
	public void delete(Tiporol entity) throws Exception;
	
	public void deleteAll(List<Tiporol> entities) throws Exception;
}
