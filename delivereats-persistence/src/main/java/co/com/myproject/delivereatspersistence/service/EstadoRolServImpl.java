package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadorol;
import co.com.myproject.delivereatspersistence.repository.IEstadoRolRepo;

@Service
public class EstadoRolServImpl implements IEstadoRolServ {

	@Autowired
	private IEstadoRolRepo repo;
	
	public List<Estadorol> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadorol> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadorol getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadorol save(Estadorol entity) {
		return repo.save(entity);
	}
	
	public List<Estadorol> saveAll(List<Estadorol> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadorol update(Estadorol entity) {
		return repo.save(entity);
	}
	
	public List<Estadorol> updateAll(List<Estadorol> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadorol entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadorol> entities) {
		repo.deleteAll(entities);
	}
}
