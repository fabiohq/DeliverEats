package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadopersona;
import co.com.myproject.delivereatspersistence.repository.IEstadoPersonaRepo;

@Service
public class EstadoPersonaServImpl implements IEstadoPersonaServ {

	@Autowired
	private IEstadoPersonaRepo repo;
	
	public List<Estadopersona> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadopersona> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadopersona getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadopersona save(Estadopersona entity) {
		return repo.save(entity);
	}
	
	public List<Estadopersona> saveAll(List<Estadopersona> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadopersona update(Estadopersona entity) {
		return repo.save(entity);
	}
	
	public List<Estadopersona> updateAll(List<Estadopersona> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadopersona entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadopersona> entities) {
		repo.deleteAll(entities);
	}
}
