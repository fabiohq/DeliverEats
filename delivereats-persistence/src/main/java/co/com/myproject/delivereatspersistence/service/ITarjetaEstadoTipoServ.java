package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tarjetaestadotipo;
import co.com.myproject.delivereatspersistence.entity.TarjetaestadotipoPK;

public interface ITarjetaEstadoTipoServ {
	
	public Tarjetaestadotipo getOne(TarjetaestadotipoPK id) throws Exception;
	
	public boolean existsById(TarjetaestadotipoPK id) throws Exception;
	
	public Tarjetaestadotipo save(Tarjetaestadotipo entity) throws Exception;
	
	public List<Tarjetaestadotipo> saveAll(List<Tarjetaestadotipo> entities) throws Exception;
	
	public Tarjetaestadotipo update(Tarjetaestadotipo entity) throws Exception;
	
	public List<Tarjetaestadotipo> updateAll(List<Tarjetaestadotipo> entities) throws Exception;
	
	public void delete(Tarjetaestadotipo entity) throws Exception;
	
	public void deleteAll(List<Tarjetaestadotipo> entities) throws Exception;
}
