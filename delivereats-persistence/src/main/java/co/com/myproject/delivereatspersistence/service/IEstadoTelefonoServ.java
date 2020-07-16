package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadotelefono;

public interface IEstadoTelefonoServ {

	public Estadotelefono getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadotelefono save(Estadotelefono entity) throws Exception;
	
	public List<Estadotelefono> saveAll(List<Estadotelefono> entities) throws Exception;
	
	public Estadotelefono update(Estadotelefono entity) throws Exception;
	
	public List<Estadotelefono> updateAll(List<Estadotelefono> entities) throws Exception;
	
	public void delete(Estadotelefono entity) throws Exception;
	
	public void deleteAll(List<Estadotelefono> entities) throws Exception;
}
