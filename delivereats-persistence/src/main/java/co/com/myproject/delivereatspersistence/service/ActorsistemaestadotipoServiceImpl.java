package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Actorsistemaestadotipo;
import co.com.myproject.delivereatspersistence.entity.ActorsistemaestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IActorsistemaestadotipoRepo;

@Service
public class ActorsistemaestadotipoServiceImpl implements IActorsistemaestadotipoService{

	@Autowired
	private IActorsistemaestadotipoRepo repo;
	
	public List<Actorsistemaestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Actorsistemaestadotipo> findById(ActorsistemaestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Actorsistemaestadotipo getOne(ActorsistemaestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(ActorsistemaestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Actorsistemaestadotipo save(Actorsistemaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Actorsistemaestadotipo> saveAll(List<Actorsistemaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Actorsistemaestadotipo update(Actorsistemaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Actorsistemaestadotipo> updateAll(List<Actorsistemaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Actorsistemaestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Actorsistemaestadotipo> entities) {
		repo.deleteAll(entities);
	}
	
}
