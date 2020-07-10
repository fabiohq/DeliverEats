package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipopersona;
import co.com.myproject.delivereatspersistence.repository.ITipoPersonaRepo;

@Service
public class TipoPersonaServImpl implements ITipoPersonaServ{
	@Autowired
	private ITipoPersonaRepo repo;
	
	public List<Tipopersona> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipopersona> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipopersona getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipopersona save(Tipopersona entity) {
		return repo.save(entity);
	}
	
	public List<Tipopersona> saveAll(List<Tipopersona> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipopersona update(Tipopersona entity) {
		return repo.save(entity);
	}
	
	public List<Tipopersona> updateAll(List<Tipopersona> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipopersona entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipopersona> entities) {
		repo.deleteAll(entities);
	}
}
