package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipoestablecimiento;

public interface ITipoEstablecimientoServ {
	
	public Tipoestablecimiento getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipoestablecimiento save(Tipoestablecimiento entity) throws Exception;
	
	public List<Tipoestablecimiento> saveAll(List<Tipoestablecimiento> entities) throws Exception;
	
	public Tipoestablecimiento update(Tipoestablecimiento entity) throws Exception;
	
	public List<Tipoestablecimiento> updateAll(List<Tipoestablecimiento> entities) throws Exception;
	
	public void delete(Tipoestablecimiento entity) throws Exception;
	
	public void deleteAll(List<Tipoestablecimiento> entities) throws Exception;
}
