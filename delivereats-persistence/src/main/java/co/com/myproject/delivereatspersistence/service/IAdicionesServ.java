package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Adiciones;

public interface IAdicionesServ {

public boolean existsById(Integer id) throws Exception;
	
	public Adiciones save(Adiciones entity) throws Exception;
	
	public List<Adiciones> saveAll(List<Adiciones> entities) throws Exception;
	
	public Adiciones update(Adiciones entity) throws Exception;
	
	public List<Adiciones> updateAll(List<Adiciones> entities) throws Exception;
	
	public void delete(Adiciones entity) throws Exception;
	
	public void deleteAll(List<Adiciones> entities) throws Exception;
}
