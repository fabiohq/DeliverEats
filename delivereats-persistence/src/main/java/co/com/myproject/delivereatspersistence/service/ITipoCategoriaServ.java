package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipocategoria;

public interface ITipoCategoriaServ {
	
	public Tipocategoria getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipocategoria save(Tipocategoria entity) throws Exception;
	
	public List<Tipocategoria> saveAll(List<Tipocategoria> entities) throws Exception;
	
	public Tipocategoria update(Tipocategoria entity) throws Exception;
	
	public List<Tipocategoria> updateAll(List<Tipocategoria> entities) throws Exception;
	
	public void delete(Tipocategoria entity) throws Exception;
	
	public void deleteAll(List<Tipocategoria> entities) throws Exception;
}
