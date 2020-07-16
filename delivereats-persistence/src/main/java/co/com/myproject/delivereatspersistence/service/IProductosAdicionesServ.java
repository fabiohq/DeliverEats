package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;

public interface IProductosAdicionesServ {
	
	public Productoadiciones getOne(ProductoadicionesPK id) throws Exception;
	
	//public boolean existsById(ProductoadicionesPK id) throws Exception;
	
	public Productoadiciones save(Productoadiciones entity) throws Exception;
	
	public List<Productoadiciones> saveAll(List<Productoadiciones> entities) throws Exception;
	
	public Productoadiciones update(Productoadiciones entity) throws Exception;
	
	public List<Productoadiciones> updateAll(List<Productoadiciones> entities) throws Exception;
	
	public void delete(Productoadiciones entity) throws Exception;
	
	public void deleteAll(List<Productoadiciones> entities) throws Exception;
}
