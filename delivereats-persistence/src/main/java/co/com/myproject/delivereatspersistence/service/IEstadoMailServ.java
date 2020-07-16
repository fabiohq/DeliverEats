package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadomail;

public interface IEstadoMailServ {

	public List<Estadomail> saveAll(List<Estadomail> entities) throws Exception;
	
	public Estadomail update(Estadomail entity) throws Exception;
	
	public List<Estadomail> updateAll(List<Estadomail> entities) throws Exception;
	
	public void delete(Estadomail entity) throws Exception;
	
	public void deleteAll(List<Estadomail> entities) throws Exception;
}
