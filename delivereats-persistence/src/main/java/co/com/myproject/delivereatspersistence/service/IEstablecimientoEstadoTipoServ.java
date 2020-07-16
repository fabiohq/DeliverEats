package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Establecimientoestadotipo;

public interface IEstablecimientoEstadoTipoServ {

	public List<Establecimientoestadotipo> saveAll(List<Establecimientoestadotipo> entities) throws Exception;
	
	public Establecimientoestadotipo update(Establecimientoestadotipo entity) throws Exception;
	
	public List<Establecimientoestadotipo> updateAll(List<Establecimientoestadotipo> entities) throws Exception;
	
	public void delete(Establecimientoestadotipo entity) throws Exception;
	
	public void deleteAll(List<Establecimientoestadotipo> entities) throws Exception;
}
