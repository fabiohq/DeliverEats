package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Categoria;

public interface ICategoriaServ {

	public List<Categoria> saveAll(List<Categoria> entities) throws Exception;
	
	public Categoria update(Categoria entity) throws Exception;
	
	public List<Categoria> updateAll(List<Categoria> entities) throws Exception;
	
	public void delete(Categoria entity) throws Exception;
	
	public void deleteAll(List<Categoria> entities) throws Exception;
}
