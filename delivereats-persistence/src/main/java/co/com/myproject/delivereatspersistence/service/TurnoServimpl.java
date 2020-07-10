package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Turno;
import co.com.myproject.delivereatspersistence.repository.ITurnoRepo;

@Service
public class TurnoServimpl implements ITurnoServ{
	@Autowired
	private ITurnoRepo repo;
	
	public List<Turno> findAll() {
		return repo.findAll();
	}
	
	public Optional<Turno> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Turno getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Turno save(Turno entity) {
		return repo.save(entity);
	}
	
	public List<Turno> saveAll(List<Turno> entities) {
		return repo.saveAll(entities);
	}
	
	public Turno update(Turno entity) {
		return repo.save(entity);
	}
	
	public List<Turno> updateAll(List<Turno> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Turno entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Turno> entities) {
		repo.deleteAll(entities);
	}
}
