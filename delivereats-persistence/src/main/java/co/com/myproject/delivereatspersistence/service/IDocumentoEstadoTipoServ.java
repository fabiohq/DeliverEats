package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Documentoestadotipo;
import co.com.myproject.delivereatspersistence.entity.DocumentoestadotipoPK;

public interface IDocumentoEstadoTipoServ {

public Documentoestadotipo getOne(DocumentoestadotipoPK id) throws Exception;
	
	public boolean existsById(DocumentoestadotipoPK id) throws Exception;
	
	public Documentoestadotipo save(Documentoestadotipo entity) throws Exception;
	
	public List<Documentoestadotipo> saveAll(List<Documentoestadotipo> entities) throws Exception;
	
	public Documentoestadotipo update(Documentoestadotipo entity) throws Exception;
	
	public List<Documentoestadotipo> updateAll(List<Documentoestadotipo> entities) throws Exception;
	
	public void delete(Documentoestadotipo entity) throws Exception;
	
	public void deleteAll(List<Documentoestadotipo> entities) throws Exception;
}
