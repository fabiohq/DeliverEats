package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipotarjeta;

public interface ITipoTarjetaServ {
	
	public Tipotarjeta getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipotarjeta save(Tipotarjeta entity) throws Exception;
	
	public List<Tipotarjeta> saveAll(List<Tipotarjeta> entities) throws Exception;
	
	public Tipotarjeta update(Tipotarjeta entity) throws Exception;
	
	public List<Tipotarjeta> updateAll(List<Tipotarjeta> entities) throws Exception;
	
	public void delete(Tipotarjeta entity) throws Exception;
	
	public void deleteAll(List<Tipotarjeta> entities) throws Exception;
}
