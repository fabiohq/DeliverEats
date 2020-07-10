package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Personaestadotipo;
import co.com.myproject.delivereatspersistence.entity.PersonaestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IPersonaEstadoTipoRepo;

@Service
public class PersonaEstadoTipoServImpl implements IPersonaEstadoTipoServ{
	@Autowired
	private IPersonaEstadoTipoRepo repo;
	
	public List<Personaestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Personaestadotipo> findById(PersonaestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Personaestadotipo getOne(PersonaestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(PersonaestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Personaestadotipo save(Personaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Personaestadotipo> saveAll(List<Personaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Personaestadotipo update(Personaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Personaestadotipo> updateAll(List<Personaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Personaestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Personaestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
