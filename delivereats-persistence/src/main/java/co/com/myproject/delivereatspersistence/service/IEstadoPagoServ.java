package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadopago;

public interface IEstadoPagoServ {
	
	public List<Estadopago> saveAll(List<Estadopago> entities) throws Exception;
	
	public Estadopago update(Estadopago entity) throws Exception;
	
	public List<Estadopago> updateAll(List<Estadopago> entities) throws Exception;
	
	public void delete(Estadopago entity) throws Exception;
	
	public void deleteAll(List<Estadopago> entities) throws Exception;
}
