package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Categoria;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ICategoriaRepo;

@Service
public class CategoriaServImpl implements ICategoriaServ {

	@Autowired
	private ICategoriaRepo repo;
	
	public List<Categoria> findAll() {
		return repo.findAll();
	}
	
	public Optional<Categoria> findById(CategoriaestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Categoria getOne(CategoriaestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(CategoriaestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Categoria save(Categoria entity) {
		return repo.save(entity);
	}
	
	public List<Categoria> saveAll(List<Categoria> entities) {
		return repo.saveAll(entities);
	}
	
	public Categoria update(Categoria entity) {
		return repo.save(entity);
	}
	
	public List<Categoria> updateAll(List<Categoria> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Categoria entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Categoria> entities) {
		repo.deleteAll(entities);
	}
}
