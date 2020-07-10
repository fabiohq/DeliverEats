package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoubicacion;
import co.com.myproject.delivereatspersistence.repository.IEstadoUbicacionRepo;

@Service
public class EstadoUbicacionServImpl implements IEstadoUbicacionServ {

	@Autowired
	private IEstadoUbicacionRepo repo;
	
	public List<Estadoubicacion> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoubicacion> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoubicacion getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoubicacion save(Estadoubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Estadoubicacion> saveAll(List<Estadoubicacion> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoubicacion update(Estadoubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Estadoubicacion> updateAll(List<Estadoubicacion> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoubicacion entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoubicacion> entities) {
		repo.deleteAll(entities);
	}
}
