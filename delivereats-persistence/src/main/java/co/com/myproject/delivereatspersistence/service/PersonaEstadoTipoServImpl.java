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
	
	public List<Personaestadotipo> findAll() throws Exception{
		return repo.findAll();
	}
	
	public Optional<Personaestadotipo> findById(PersonaestadotipoPK id) throws Exception{
		return repo.findById(id);
	}
	
	public Personaestadotipo getOne(PersonaestadotipoPK id) throws Exception{
		return repo.getOne(id);
	}
	
	public boolean existsById(PersonaestadotipoPK id) throws Exception{
		return repo.existsById(id);
	}
	
	public Personaestadotipo save(Personaestadotipo entity) throws Exception{
		return repo.save(entity);
	}
	
	public List<Personaestadotipo> saveAll(List<Personaestadotipo> entities) throws Exception{
		return repo.saveAll(entities);
	}
	
	public Personaestadotipo update(Personaestadotipo entity) throws Exception{
		return repo.save(entity);
	}
	
	public List<Personaestadotipo> updateAll(List<Personaestadotipo> entities) throws Exception{
		return repo.saveAll(entities);
	}
	public void delete(Personaestadotipo entity) throws Exception{
		repo.delete(entity);
	}
	
	public void deleteAll(List<Personaestadotipo> entities) throws Exception{
		repo.deleteAll(entities);
	}
}
