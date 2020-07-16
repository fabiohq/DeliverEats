package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadoturno;

public interface IEstadoTurnoServ {

	public Estadoturno getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadoturno save(Estadoturno entity) throws Exception;
	
	public List<Estadoturno> saveAll(List<Estadoturno> entities) throws Exception;
	
	public Estadoturno update(Estadoturno entity) throws Exception;
	
	public List<Estadoturno> updateAll(List<Estadoturno> entities) throws Exception;
	
	public void delete(Estadoturno entity) throws Exception;
	
	public void deleteAll(List<Estadoturno> entities) throws Exception;
}
