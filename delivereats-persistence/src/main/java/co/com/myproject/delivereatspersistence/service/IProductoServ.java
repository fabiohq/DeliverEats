package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Producto;
import co.com.myproject.delivereatspersistence.entity.ProductoPK;

public interface IProductoServ {
	
	public Producto getOne(ProductoPK id) throws Exception;
	
	public boolean existsById(ProductoPK id) throws Exception;
	
	public Producto save(Producto entity) throws Exception;
	
	public List<Producto> saveAll(List<Producto> entities) throws Exception;
	
	public Producto update(Producto entity) throws Exception;
	
	public List<Producto> updateAll(List<Producto> entities) throws Exception;
	
	public void delete(Producto entity) throws Exception;
	
	public void deleteAll(List<Producto> entities) throws Exception;
}
