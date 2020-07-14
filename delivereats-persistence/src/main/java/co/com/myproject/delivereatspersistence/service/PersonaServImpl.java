package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Persona;
import co.com.myproject.delivereatspersistence.repository.IPersonaRepo;

@Service
public class PersonaServImpl implements IPersonaServ{
	@Autowired
	private IPersonaRepo repo;
	
	public List<Persona> findAll()throws Exception {
		return repo.findAll();
	}
	
	public Optional<Persona> findById(Integer id) throws Exception{
		return repo.findById(id);
	}
	
	public Persona getOne(Integer id) throws Exception{
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) throws Exception{
		return repo.existsById(id);
	}
	
	public Persona save(Persona entity) throws Exception{
		return repo.save(entity);
	}
	
	public List<Persona> saveAll(List<Persona> entities) throws Exception{
		return repo.saveAll(entities);
	}
	
	public Persona update(Persona entity) throws Exception{
		return repo.save(entity);
	}
	
	public List<Persona> updateAll(List<Persona> entities) throws Exception{
		return repo.saveAll(entities);
	}
	public void delete(Persona entity) throws Exception{
		repo.delete(entity);
	}
	
	public void deleteAll(List<Persona> entities) throws Exception{
		repo.deleteAll(entities);
	}
}
