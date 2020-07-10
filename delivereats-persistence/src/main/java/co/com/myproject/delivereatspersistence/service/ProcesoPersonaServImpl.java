package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Procesopersona;
import co.com.myproject.delivereatspersistence.repository.IProcesoPersonaRepo;

@Service
public class ProcesoPersonaServImpl implements IProcesoPersonaServ{
	@Autowired
	private IProcesoPersonaRepo repo;
	
	public List<Procesopersona> findAll() {
		return repo.findAll();
	}
	
	public Optional<Procesopersona> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Procesopersona getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Procesopersona save(Procesopersona entity) {
		return repo.save(entity);
	}
	
	public List<Procesopersona> saveAll(List<Procesopersona> entities) {
		return repo.saveAll(entities);
	}
	
	public Procesopersona update(Procesopersona entity) {
		return repo.save(entity);
	}
	
	public List<Procesopersona> updateAll(List<Procesopersona> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Procesopersona entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Procesopersona> entities) {
		repo.deleteAll(entities);
	}
}
