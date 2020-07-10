package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Rol;
import co.com.myproject.delivereatspersistence.repository.IRolRepo;

@Service
public class RolServImpl implements IRolServ{
	@Autowired
	private IRolRepo repo;
	
	public List<Rol> findAll() {
		return repo.findAll();
	}
	
	public Optional<Rol> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Rol getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Rol save(Rol entity) {
		return repo.save(entity);
	}
	
	public List<Rol> saveAll(List<Rol> entities) {
		return repo.saveAll(entities);
	}
	
	public Rol update(Rol entity) {
		return repo.save(entity);
	}
	
	public List<Rol> updateAll(List<Rol> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Rol entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Rol> entities) {
		repo.deleteAll(entities);
	}
}
