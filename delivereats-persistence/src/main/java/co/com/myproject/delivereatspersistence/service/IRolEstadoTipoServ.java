package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Rolestadotipo;
import co.com.myproject.delivereatspersistence.entity.RolestadotipoPK;

public interface IRolEstadoTipoServ {
	
	public Rolestadotipo getOne(RolestadotipoPK id) throws Exception;
	
	public boolean existsById(RolestadotipoPK id) throws Exception;
	
	public Rolestadotipo save(Rolestadotipo entity) throws Exception;
	
	public List<Rolestadotipo> saveAll(List<Rolestadotipo> entities) throws Exception;
	
	public Rolestadotipo update(Rolestadotipo entity) throws Exception;
	
	public List<Rolestadotipo> updateAll(List<Rolestadotipo> entities) throws Exception;
	
	public void delete(Rolestadotipo entity) throws Exception;
	
	public void deleteAll(List<Rolestadotipo> entities) throws Exception;
}
