package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadoformapago;

public interface IEstadoFormaPagoServ {

	public List<Estadoformapago> saveAll(List<Estadoformapago> entities) throws Exception;
	
	public Estadoformapago update(Estadoformapago entity) throws Exception;
	
	public List<Estadoformapago> updateAll(List<Estadoformapago> entities) throws Exception;
	
	public void delete(Estadoformapago entity) throws Exception;
	
	public void deleteAll(List<Estadoformapago> entities) throws Exception;
}
