package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipotelefono;

public interface ITipoTelefonoServ {
	
	public Tipotelefono getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipotelefono save(Tipotelefono entity) throws Exception;
	
	public List<Tipotelefono> saveAll(List<Tipotelefono> entities) throws Exception;
	
	public Tipotelefono update(Tipotelefono entity) throws Exception;
	
	public List<Tipotelefono> updateAll(List<Tipotelefono> entities) throws Exception;
	
	public void delete(Tipotelefono entity) throws Exception;
	
	public void deleteAll(List<Tipotelefono> entities) throws Exception;
}
