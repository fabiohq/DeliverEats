package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Actorsistema;

public interface IActorSistemaServ {

public Actorsistema getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Actorsistema save(Actorsistema entity) throws Exception;
	
	public List<Actorsistema> saveAll(List<Actorsistema> entities) throws Exception;
	
	public Actorsistema update(Actorsistema entity) throws Exception;
	
	public List<Actorsistema> updateAll(List<Actorsistema> entities) throws Exception;
	
	public void delete(Actorsistema entity) throws Exception;
	
	public void deleteAll(List<Actorsistema> entities) throws Exception;
}
