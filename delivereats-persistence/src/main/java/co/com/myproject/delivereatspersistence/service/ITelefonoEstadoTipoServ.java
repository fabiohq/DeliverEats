package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Telefonoestadotipo;
import co.com.myproject.delivereatspersistence.entity.TelefonoestadotipoPK;

public interface ITelefonoEstadoTipoServ {
	
	public Telefonoestadotipo getOne(TelefonoestadotipoPK id) throws Exception;
	
	public boolean existsById(TelefonoestadotipoPK id) throws Exception;
	
	public Telefonoestadotipo save(Telefonoestadotipo entity) throws Exception;
	
	public List<Telefonoestadotipo> saveAll(List<Telefonoestadotipo> entities) throws Exception;
	
	public Telefonoestadotipo update(Telefonoestadotipo entity) throws Exception;
	
	public List<Telefonoestadotipo> updateAll(List<Telefonoestadotipo> entities) throws Exception;
	
	public void delete(Telefonoestadotipo entity) throws Exception;
	
	public void deleteAll(List<Telefonoestadotipo> entities) throws Exception;
}
