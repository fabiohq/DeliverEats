package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoproducto;
import co.com.myproject.delivereatspersistence.repository.IEstadoProductoRepo;

@Service
public class EstadoProductoServImpl implements IEstadoProductoServ {

	@Autowired
	private IEstadoProductoRepo repo;
	
	public List<Estadoproducto> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoproducto> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoproducto getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoproducto save(Estadoproducto entity) {
		return repo.save(entity);
	}
	
	public List<Estadoproducto> saveAll(List<Estadoproducto> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoproducto update(Estadoproducto entity) {
		return repo.save(entity);
	}
	
	public List<Estadoproducto> updateAll(List<Estadoproducto> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoproducto entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoproducto> entities) {
		repo.deleteAll(entities);
	}
}
