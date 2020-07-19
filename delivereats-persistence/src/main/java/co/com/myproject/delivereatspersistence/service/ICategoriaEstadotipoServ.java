package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Categoriaestadotipo;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;

public interface ICategoriaEstadotipoServ {

	public Categoriaestadotipo getOne(CategoriaestadotipoPK id) throws Exception;
	
	public boolean existsById(CategoriaestadotipoPK id) throws Exception;
	
	public Categoriaestadotipo save(Categoriaestadotipo entity) throws Exception;
	
	public List<Categoriaestadotipo> saveAll(List<Categoriaestadotipo> entities) throws Exception;
	
	public Categoriaestadotipo update(Categoriaestadotipo entity) throws Exception;
	
	public List<Categoriaestadotipo> updateAll(List<Categoriaestadotipo> entities) throws Exception;
	
	public void delete(Categoriaestadotipo entity) throws Exception;
	
	public void deleteAll(List<Categoriaestadotipo> entities) throws Exception;
}
