package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipoproducto;
import co.com.myproject.delivereatspersistence.repository.ITipoProductoRepo;

@Service
public class TipoProductoServImpl implements ITipoProductoServ{
	@Autowired
	private ITipoProductoRepo repo;
	
	public List<Tipoproducto> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipoproducto> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipoproducto getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipoproducto save(Tipoproducto entity) {
		return repo.save(entity);
	}
	
	public List<Tipoproducto> saveAll(List<Tipoproducto> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipoproducto update(Tipoproducto entity) {
		return repo.save(entity);
	}
	
	public List<Tipoproducto> updateAll(List<Tipoproducto> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipoproducto entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipoproducto> entities) {
		repo.deleteAll(entities);
	}
}
