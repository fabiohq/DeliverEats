package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Actorsistema;
import co.com.myproject.delivereatspersistence.repository.IActorSistemaRepo;

@Service
public class ActorSistemaServImpl implements IActorSistemaServ {

	@Autowired
	private IActorSistemaRepo repo;
	
	public List<Actorsistema> findAll() {
		return repo.findAll();
	}
	
	public Optional<Actorsistema> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Actorsistema getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Actorsistema save(Actorsistema entity) {
		return repo.save(entity);
	}
	
	public List<Actorsistema> saveAll(List<Actorsistema> entities) {
		return repo.saveAll(entities);
	}
	
	public Actorsistema update(Actorsistema entity) {
		return repo.save(entity);
	}
	
	public List<Actorsistema> updateAll(List<Actorsistema> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Actorsistema entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Actorsistema> entities) {
		repo.deleteAll(entities);
	}
}
