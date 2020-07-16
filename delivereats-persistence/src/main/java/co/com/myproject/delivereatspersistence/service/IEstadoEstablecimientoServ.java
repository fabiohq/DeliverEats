package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadoestablecimiento;

public interface IEstadoEstablecimientoServ {

	public List<Estadoestablecimiento> saveAll(List<Estadoestablecimiento> entities) throws Exception;
	
	public Estadoestablecimiento update(Estadoestablecimiento entity) throws Exception;
	
	public List<Estadoestablecimiento> updateAll(List<Estadoestablecimiento> entities) throws Exception;
	
	public void delete(Estadoestablecimiento entity) throws Exception;
	
	public void deleteAll(List<Estadoestablecimiento> entities) throws Exception;
}
