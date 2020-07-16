package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Transporteestadotipo;
import co.com.myproject.delivereatspersistence.entity.TransporteestadotipoPK;

public interface ITransporteEstadoTipoServ {
	
	public Transporteestadotipo getOne(TransporteestadotipoPK id) throws Exception;
	
	public boolean existsById(TransporteestadotipoPK id) throws Exception;
	
	public Transporteestadotipo save(Transporteestadotipo entity) throws Exception;
	
	public List<Transporteestadotipo> saveAll(List<Transporteestadotipo> entities) throws Exception;
	
	public Transporteestadotipo update(Transporteestadotipo entity) throws Exception;
	
	public List<Transporteestadotipo> updateAll(List<Transporteestadotipo> entities) throws Exception;
	
	public void delete(Transporteestadotipo entity) throws Exception;
	
	public void deleteAll(List<Transporteestadotipo> entities) throws Exception;
}
