package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipoproducto;

public interface ITipoProductoServ {
	
	public Tipoproducto getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipoproducto save(Tipoproducto entity) throws Exception;
	
	public List<Tipoproducto> saveAll(List<Tipoproducto> entities) throws Exception;
	
	public Tipoproducto update(Tipoproducto entity) throws Exception;
	
	public List<Tipoproducto> updateAll(List<Tipoproducto> entities) throws Exception;
	
	public void delete(Tipoproducto entity) throws Exception;
	
	public void deleteAll(List<Tipoproducto> entities) throws Exception;
}
