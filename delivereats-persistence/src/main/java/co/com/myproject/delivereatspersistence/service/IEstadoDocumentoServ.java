package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadodocumento;
import co.com.myproject.delivereatspersistence.entity.Estadodocumento;

public interface IEstadoDocumentoServ {

public Estadodocumento getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadodocumento save(Estadodocumento entity) throws Exception;
	
	public List<Estadodocumento> saveAll(List<Estadodocumento> entities) throws Exception;
	
	public Estadodocumento update(Estadodocumento entity) throws Exception;
	
	public List<Estadodocumento> updateAll(List<Estadodocumento> entities) throws Exception;
	
	public void delete(Estadodocumento entity) throws Exception;
	
	public void deleteAll(List<Estadodocumento> entities) throws Exception;
}
