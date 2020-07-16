package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipomail;

public interface ITipoMailServ {
	
	public Tipomail getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipomail save(Tipomail entity) throws Exception;
	
	public List<Tipomail> saveAll(List<Tipomail> entities) throws Exception;
	
	public Tipomail update(Tipomail entity) throws Exception;
	
	public List<Tipomail> updateAll(List<Tipomail> entities) throws Exception;
	
	public void delete(Tipomail entity) throws Exception;
	
	public void deleteAll(List<Tipomail> entities) throws Exception;
}
