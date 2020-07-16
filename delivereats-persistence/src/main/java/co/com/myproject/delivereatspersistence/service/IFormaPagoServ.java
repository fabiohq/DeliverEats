package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Formapago;

public interface IFormaPagoServ {
	
	public Formapago getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Formapago save(Formapago entity) throws Exception;
	
	public List<Formapago> saveAll(List<Formapago> entities) throws Exception;
	
	public Formapago update(Formapago entity) throws Exception;
	
	public List<Formapago> updateAll(List<Formapago> entities) throws Exception;
	
	public void delete(Formapago entity) throws Exception;
	
	public void deleteAll(List<Formapago> entities) throws Exception;
}
