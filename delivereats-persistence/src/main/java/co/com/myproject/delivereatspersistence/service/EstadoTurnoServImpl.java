package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoturno;
import co.com.myproject.delivereatspersistence.repository.IEstadoTurnoRepo;

@Service
public class EstadoTurnoServImpl implements IEstadoTurnoServ {

	@Autowired
	private IEstadoTurnoRepo repo;
	
	public List<Estadoturno> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoturno> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoturno getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoturno save(Estadoturno entity) {
		return repo.save(entity);
	}
	
	public List<Estadoturno> saveAll(List<Estadoturno> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoturno update(Estadoturno entity) {
		return repo.save(entity);
	}
	
	public List<Estadoturno> updateAll(List<Estadoturno> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoturno entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoturno> entities) {
		repo.deleteAll(entities);
	}
}
