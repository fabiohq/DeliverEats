package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Personaestadotipo;
import co.com.myproject.delivereatspersistence.entity.PersonaestadotipoPK;

public interface IPersonaEstadoTipoServ {

	public List<Personaestadotipo> findAll() throws Exception;
	
	public Optional<Personaestadotipo> findById(PersonaestadotipoPK id) throws Exception;
	
	public Personaestadotipo getOne(PersonaestadotipoPK id) throws Exception;
	
	public boolean existsById(PersonaestadotipoPK id) throws Exception;
	
	public Personaestadotipo save(Personaestadotipo entity) throws Exception;
	
	public List<Personaestadotipo> saveAll(List<Personaestadotipo> entities) throws Exception;
	
	public Personaestadotipo update(Personaestadotipo entity) throws Exception;
	
	public List<Personaestadotipo> updateAll(List<Personaestadotipo> entities) throws Exception;
	
	public void delete(Personaestadotipo entity) throws Exception;
	
	public void deleteAll(List<Personaestadotipo> entities) throws Exception;
}
