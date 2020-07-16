package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipopago;

public interface ITipoPagoServ {
	
	public Tipopago getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipopago save(Tipopago entity) throws Exception;
	
	public List<Tipopago> saveAll(List<Tipopago> entities) throws Exception;
	
	public Tipopago update(Tipopago entity) throws Exception;
	
	public List<Tipopago> updateAll(List<Tipopago> entities) throws Exception;
	
	public void delete(Tipopago entity) throws Exception;
	
	public void deleteAll(List<Tipopago> entities) throws Exception;
}
