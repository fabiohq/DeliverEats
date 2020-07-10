package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Especialidad;
import co.com.myproject.delivereatspersistence.repository.IEspecialidadRepo;

@Service
public class EspecialidadServImpl implements IEspecialidadServ {

	@Autowired
	private IEspecialidadRepo repo;
	
	public List<Especialidad> findAll() {
		return repo.findAll();
	}
	
	public Optional<Especialidad> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Especialidad getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Especialidad save(Especialidad entity) {
		return repo.save(entity);
	}
	
	public List<Especialidad> saveAll(List<Especialidad> entities) {
		return repo.saveAll(entities);
	}
	
	public Especialidad update(Especialidad entity) {
		return repo.save(entity);
	}
	
	public List<Especialidad> updateAll(List<Especialidad> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Especialidad entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Especialidad> entities) {
		repo.deleteAll(entities);
	}
}
