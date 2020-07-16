package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Credencialesestadotipo;

public interface ICredencialEstadoTipoServ {

	public List<Credencialesestadotipo> saveAll(List<Credencialesestadotipo> entities) throws Exception;
	
	public Credencialesestadotipo update(Credencialesestadotipo entity) throws Exception;
	
	public List<Credencialesestadotipo> updateAll(List<Credencialesestadotipo> entities) throws Exception;
	
	public void delete(Credencialesestadotipo entity) throws Exception;
	
	public void deleteAll(List<Credencialesestadotipo> entities) throws Exception;
}
