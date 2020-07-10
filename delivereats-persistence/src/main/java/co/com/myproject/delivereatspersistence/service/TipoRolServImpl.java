package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tiporol;
import co.com.myproject.delivereatspersistence.repository.ITipoRolRepo;

@Service
public class TipoRolServImpl implements ITipoRolServ{
	@Autowired
	private ITipoRolRepo repo;
	
	public List<Tiporol> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tiporol> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tiporol getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tiporol save(Tiporol entity) {
		return repo.save(entity);
	}
	
	public List<Tiporol> saveAll(List<Tiporol> entities) {
		return repo.saveAll(entities);
	}
	
	public Tiporol update(Tiporol entity) {
		return repo.save(entity);
	}
	
	public List<Tiporol> updateAll(List<Tiporol> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tiporol entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tiporol> entities) {
		repo.deleteAll(entities);
	}
}
