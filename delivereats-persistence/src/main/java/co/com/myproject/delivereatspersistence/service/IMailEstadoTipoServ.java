package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Mailestadotipo;

public interface IMailEstadoTipoServ {
	
	public Mailestadotipo getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Mailestadotipo save(Mailestadotipo entity) throws Exception;
	
	public List<Mailestadotipo> saveAll(List<Mailestadotipo> entities) throws Exception;
	
	public Mailestadotipo update(Mailestadotipo entity) throws Exception;
	
	public List<Mailestadotipo> updateAll(List<Mailestadotipo> entities) throws Exception;
	
	public void delete(Mailestadotipo entity) throws Exception;
	
	public void deleteAll(List<Mailestadotipo> entities) throws Exception;
}
