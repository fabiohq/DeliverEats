package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Establecimiento;

public interface IEstablecimientoServ {

	public Establecimiento getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Establecimiento save(Establecimiento entity) throws Exception;
	
	public List<Establecimiento> saveAll(List<Establecimiento> entities) throws Exception;
	
	public Establecimiento update(Establecimiento entity) throws Exception;
	
	public List<Establecimiento> updateAll(List<Establecimiento> entities) throws Exception;
	
	public void delete(Establecimiento entity) throws Exception;
	
	public void deleteAll(List<Establecimiento> entities) throws Exception;
}
