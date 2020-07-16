package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Pago;

public interface IPagoServ {
	
	public Pago getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Pago save(Pago entity) throws Exception;
	
	public List<Pago> saveAll(List<Pago> entities) throws Exception;
	
	public Pago update(Pago entity) throws Exception;
	
	public List<Pago> updateAll(List<Pago> entities) throws Exception;
	
	public void delete(Pago entity) throws Exception;
	
	public void deleteAll(List<Pago> entities) throws Exception;
}
