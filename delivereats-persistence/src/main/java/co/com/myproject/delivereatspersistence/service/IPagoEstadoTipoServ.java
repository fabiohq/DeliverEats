package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Pagoestadotipo;

public interface IPagoEstadoTipoServ {
	
	public Pagoestadotipo getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Pagoestadotipo save(Pagoestadotipo entity) throws Exception;
	
	public List<Pagoestadotipo> saveAll(List<Pagoestadotipo> entities) throws Exception;
	
	public Pagoestadotipo update(Pagoestadotipo entity) throws Exception;
	
	public List<Pagoestadotipo> updateAll(List<Pagoestadotipo> entities) throws Exception;
	
	public void delete(Pagoestadotipo entity) throws Exception;
	
	public void deleteAll(List<Pagoestadotipo> entities) throws Exception;
}
