package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Productocombo;

public interface IProductoComboServ {
	
	public Productocombo getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Productocombo save(Productocombo entity) throws Exception;
	
	public List<Productocombo> saveAll(List<Productocombo> entities) throws Exception;
	
	public Productocombo update(Productocombo entity) throws Exception;
	
	public List<Productocombo> updateAll(List<Productocombo> entities) throws Exception;
	
	public void delete(Productocombo entity) throws Exception;
	
	public void deleteAll(List<Productocombo> entities) throws Exception;
}
