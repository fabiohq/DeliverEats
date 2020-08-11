package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Estadoformapago;

public interface IEstadoFormaPagoServ {

	public List<Estadoformapago> findAll() throws Exception;
	
	public Optional<Estadoformapago> findById(Integer id) throws Exception;
	
	public Estadoformapago getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadoformapago save(Estadoformapago entity) throws Exception;
	
	public List<Estadoformapago> saveAll(List<Estadoformapago> entities) throws Exception;
	
	public Estadoformapago update(Estadoformapago entity) throws Exception;
	
	public List<Estadoformapago> updateAll(List<Estadoformapago> entities) throws Exception;
	
	public void delete(Estadoformapago entity) throws Exception;
	
	public void deleteAll(List<Estadoformapago> entities) throws Exception;
}
