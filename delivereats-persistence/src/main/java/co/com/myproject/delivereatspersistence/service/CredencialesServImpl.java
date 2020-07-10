package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Credenciales;
import co.com.myproject.delivereatspersistence.repository.ICredencialesRepo;

@Service
public class CredencialesServImpl implements ICredencialesServ {

	@Autowired
	private ICredencialesRepo repo;
	
	public List<Credenciales> findAll() {
		return repo.findAll();
	}
	
	public Optional<Credenciales> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Credenciales getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Credenciales save(Credenciales entity) {
		return repo.save(entity);
	}
	
	public List<Credenciales> saveAll(List<Credenciales> entities) {
		return repo.saveAll(entities);
	}
	
	public Credenciales update(Credenciales entity) {
		return repo.save(entity);
	}
	
	public List<Credenciales> updateAll(List<Credenciales> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Credenciales entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Credenciales> entities) {
		repo.deleteAll(entities);
	}
}
