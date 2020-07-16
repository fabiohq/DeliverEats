package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipodocumento;

public interface ITipoDocumentoServ {
	
	public Tipodocumento getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipodocumento save(Tipodocumento entity) throws Exception;
	
	public List<Tipodocumento> saveAll(List<Tipodocumento> entities) throws Exception;
	
	public Tipodocumento update(Tipodocumento entity) throws Exception;
	
	public List<Tipodocumento> updateAll(List<Tipodocumento> entities) throws Exception;
	
	public void delete(Tipodocumento entity) throws Exception;
	
	public void deleteAll(List<Tipodocumento> entities) throws Exception;
}
