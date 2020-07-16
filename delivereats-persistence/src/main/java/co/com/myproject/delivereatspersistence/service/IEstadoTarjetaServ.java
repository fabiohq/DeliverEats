package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadotarjeta;

public interface IEstadoTarjetaServ {

	public Estadotarjeta getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadotarjeta save(Estadotarjeta entity) throws Exception;
	
	public List<Estadotarjeta> saveAll(List<Estadotarjeta> entities) throws Exception;
	
	public Estadotarjeta update(Estadotarjeta entity) throws Exception;
	
	public List<Estadotarjeta> updateAll(List<Estadotarjeta> entities) throws Exception;
	
	public void delete(Estadotarjeta entity) throws Exception;
	
	public void deleteAll(List<Estadotarjeta> entities) throws Exception;
}
