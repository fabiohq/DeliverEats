package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadocategoria;

public interface IEstadoCategoriaServ {

	public boolean existsById(Integer id) throws Exception;
	
	public Estadocategoria getOne(Integer id) throws Exception;
	
	public Estadocategoria save(Estadocategoria entity) throws Exception;
	
	public List<Estadocategoria> saveAll(List<Estadocategoria> entities) throws Exception;
	
	public Estadocategoria update(Estadocategoria entity) throws Exception;
	
	public List<Estadocategoria> updateAll(List<Estadocategoria> entities) throws Exception;
	
	public void delete(Estadocategoria entity) throws Exception;
	
	public void deleteAll(List<Estadocategoria> entities) throws Exception;
}
