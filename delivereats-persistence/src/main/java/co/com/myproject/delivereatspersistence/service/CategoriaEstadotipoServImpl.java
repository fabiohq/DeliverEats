package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Categoriaestadotipo;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ICategoriaEstadotipoRepo;

@Service
public class CategoriaEstadotipoServImpl implements ICategoriaEstadotipoServ {

	@Autowired
	private ICategoriaEstadotipoRepo repo;
	
	public List<Categoriaestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Categoriaestadotipo> findById(CategoriaestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Categoriaestadotipo getOne(CategoriaestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(CategoriaestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Categoriaestadotipo save(Categoriaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Categoriaestadotipo> saveAll(List<Categoriaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Categoriaestadotipo update(Categoriaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Categoriaestadotipo> updateAll(List<Categoriaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Categoriaestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Categoriaestadotipo> entities) {
		repo.deleteAll(entities);
	}
	
}
