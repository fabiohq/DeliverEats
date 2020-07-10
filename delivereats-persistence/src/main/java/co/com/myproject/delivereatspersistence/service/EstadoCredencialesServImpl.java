package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadocredenciales;
import co.com.myproject.delivereatspersistence.repository.IEstadoCredencialesRepo;

@Service
public class EstadoCredencialesServImpl implements IEstadoCredencialesServ {

	@Autowired
	private IEstadoCredencialesRepo repo;
	
	public List<Estadocredenciales> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadocredenciales> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadocredenciales getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadocredenciales save(Estadocredenciales entity) {
		return repo.save(entity);
	}
	
	public List<Estadocredenciales> saveAll(List<Estadocredenciales> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadocredenciales update(Estadocredenciales entity) {
		return repo.save(entity);
	}
	
	public List<Estadocredenciales> updateAll(List<Estadocredenciales> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadocredenciales entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadocredenciales> entities) {
		repo.deleteAll(entities);
	}
}
