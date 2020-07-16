package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Formapagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.FormapagoestadotipoPK;

public interface IFormaPagoEstadoTipoServ {
	
	public Formapagoestadotipo getOne(FormapagoestadotipoPK id) throws Exception;
	
	public boolean existsById(FormapagoestadotipoPK id) throws Exception;
	
	public Formapagoestadotipo save(Formapagoestadotipo entity) throws Exception;
	
	public List<Formapagoestadotipo> saveAll(List<Formapagoestadotipo> entities) throws Exception;
	
	public Formapagoestadotipo update(Formapagoestadotipo entity) throws Exception;
	
	public List<Formapagoestadotipo> updateAll(List<Formapagoestadotipo> entities) throws Exception;
	
	public void delete(Formapagoestadotipo entity) throws Exception;
	
	public void deleteAll(List<Formapagoestadotipo> entities) throws Exception;
}
