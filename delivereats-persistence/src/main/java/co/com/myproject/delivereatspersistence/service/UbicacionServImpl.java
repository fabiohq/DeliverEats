package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Ubicacion;
import co.com.myproject.delivereatspersistence.repository.IUbicacionRepo;

@Service
public class UbicacionServImpl implements IUbicacionServ{
	@Autowired
	private IUbicacionRepo repo;
	
	public List<Ubicacion> findAll() {
		return repo.findAll();
	}
	
	public Optional<Ubicacion> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Ubicacion getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Ubicacion save(Ubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Ubicacion> saveAll(List<Ubicacion> entities) {
		return repo.saveAll(entities);
	}
	
	public Ubicacion update(Ubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Ubicacion> updateAll(List<Ubicacion> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Ubicacion entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Ubicacion> entities) {
		repo.deleteAll(entities);
	}
}
