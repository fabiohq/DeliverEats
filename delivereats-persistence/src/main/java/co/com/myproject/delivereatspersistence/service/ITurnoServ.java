package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Turno;

public interface ITurnoServ {
	
	public Turno getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Turno save(Turno entity) throws Exception;
	
	public List<Turno> saveAll(List<Turno> entities) throws Exception;
	
	public Turno update(Turno entity) throws Exception;
	
	public List<Turno> updateAll(List<Turno> entities) throws Exception;
	
	public void delete(Turno entity) throws Exception;
	
	public void deleteAll(List<Turno> entities) throws Exception;
}
