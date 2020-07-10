package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipoubicacion;
import co.com.myproject.delivereatspersistence.repository.ITipoUbicacionRepo;

@Service
public class TipoUbicacionServImpl implements ITipoUbicacionServ{
	@Autowired
	private ITipoUbicacionRepo repo;
	
	public List<Tipoubicacion> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipoubicacion> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipoubicacion getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipoubicacion save(Tipoubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Tipoubicacion> saveAll(List<Tipoubicacion> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipoubicacion update(Tipoubicacion entity) {
		return repo.save(entity);
	}
	
	public List<Tipoubicacion> updateAll(List<Tipoubicacion> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipoubicacion entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipoubicacion> entities) {
		repo.deleteAll(entities);
	}
}
