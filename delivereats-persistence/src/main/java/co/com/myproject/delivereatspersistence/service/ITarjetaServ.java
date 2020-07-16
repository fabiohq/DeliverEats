package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tarjeta;

public interface ITarjetaServ {
	
	public Tarjeta getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tarjeta save(Tarjeta entity) throws Exception;
	
	public List<Tarjeta> saveAll(List<Tarjeta> entities) throws Exception;
	
	public Tarjeta update(Tarjeta entity) throws Exception;
	
	public List<Tarjeta> updateAll(List<Tarjeta> entities) throws Exception;
	
	public void delete(Tarjeta entity) throws Exception;
	
	public void deleteAll(List<Tarjeta> entities) throws Exception;
}
