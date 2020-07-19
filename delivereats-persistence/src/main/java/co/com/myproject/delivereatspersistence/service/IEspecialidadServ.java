package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Especialidad;

public interface IEspecialidadServ {

	public Especialidad getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Especialidad save(Especialidad entity) throws Exception;
	
	public List<Especialidad> saveAll(List<Especialidad> entities) throws Exception;
	
	public Especialidad update(Especialidad entity) throws Exception;
	
	public List<Especialidad> updateAll(List<Especialidad> entities) throws Exception;
	
	public void delete(Especialidad entity) throws Exception;
	
	public void deleteAll(List<Especialidad> entities) throws Exception;
}
