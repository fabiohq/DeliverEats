package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadocategoria;
import co.com.myproject.delivereatspersistence.repository.IEstadoCategoriaRepo;

@Service
public class EstadoCategoriaServImpl implements IEstadoCategoriaServ {

	@Autowired
	private IEstadoCategoriaRepo repo;
	
	public List<Estadocategoria> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadocategoria> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadocategoria getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadocategoria save(Estadocategoria entity) {
		return repo.save(entity);
	}
	
	public List<Estadocategoria> saveAll(List<Estadocategoria> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadocategoria update(Estadocategoria entity) {
		return repo.save(entity);
	}
	
	public List<Estadocategoria> updateAll(List<Estadocategoria> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadocategoria entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadocategoria> entities) {
		repo.deleteAll(entities);
	}
}
