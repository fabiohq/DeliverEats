package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Categoriaestadotipo;

public interface ICategoriaEstadotipoServ {

public Categoriaestadotipo save(Categoriaestadotipo entity) throws Exception;
	
	public List<Categoriaestadotipo> saveAll(List<Categoriaestadotipo> entities) throws Exception;
	
	public Categoriaestadotipo update(Categoriaestadotipo entity) throws Exception;
	
	public List<Categoriaestadotipo> updateAll(List<Categoriaestadotipo> entities) throws Exception;
	
	public void delete(Categoriaestadotipo entity) throws Exception;
	
	public void deleteAll(List<Categoriaestadotipo> entities) throws Exception;
}
