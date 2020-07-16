package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Documento;

public interface IDocumentoServ {

public List<Documento> findAll()throws Exception;
	
	public Optional<Documento> findById(Integer id) throws Exception;
	
	public Documento getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Documento save(Documento entity) throws Exception;
	
	public List<Documento> saveAll(List<Documento> entities) throws Exception;
	
	public Documento update(Documento entity) throws Exception;
	
	public List<Documento> updateAll(List<Documento> entities) throws Exception;
	
	public void delete(Documento entity) throws Exception;
	
	public void deleteAll(List<Documento> entities) throws Exception;
}
