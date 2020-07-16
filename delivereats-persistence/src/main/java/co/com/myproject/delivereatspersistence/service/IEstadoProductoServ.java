package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Estadopedido;
import co.com.myproject.delivereatspersistence.entity.Estadoproducto;

public interface IEstadoProductoServ {

public List<Estadoproducto> findAll() throws Exception;
	
	public Optional<Estadoproducto> findById(Integer id) throws Exception;
	
	public Estadoproducto getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadoproducto save(Estadoproducto entity) throws Exception;
	
	public List<Estadoproducto> saveAll(List<Estadoproducto> entities) throws Exception;
	
	public Estadoproducto update(Estadoproducto entity) throws Exception;
	
	public List<Estadoproducto> updateAll(List<Estadoproducto> entities) throws Exception;
	
	public void delete(Estadoproducto entity) throws Exception;
	
	public void deleteAll(List<Estadoproducto> entities) throws Exception;
}
