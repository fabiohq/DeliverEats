package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadomail;
import co.com.myproject.delivereatspersistence.repository.IEstadoMailRepo;

@Service
public class EstadoMailServImpl implements IEstadoMailServ {

	@Autowired
	private IEstadoMailRepo repo;
	
	public List<Estadomail> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadomail> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadomail getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadomail save(Estadomail entity) {
		return repo.save(entity);
	}
	
	public List<Estadomail> saveAll(List<Estadomail> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadomail update(Estadomail entity) {
		return repo.save(entity);
	}
	
	public List<Estadomail> updateAll(List<Estadomail> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadomail entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadomail> entities) {
		repo.deleteAll(entities);
	}
}
