package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipocredenciales;
import co.com.myproject.delivereatspersistence.repository.ITipoCredencialesRepo;

@Service
public class TipoCredencialesServImpl implements ITipoCredencialesServ{
	@Autowired
	private ITipoCredencialesRepo repo;
	
	public List<Tipocredenciales> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipocredenciales> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipocredenciales getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipocredenciales save(Tipocredenciales entity) {
		return repo.save(entity);
	}
	
	public List<Tipocredenciales> saveAll(List<Tipocredenciales> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipocredenciales update(Tipocredenciales entity) {
		return repo.save(entity);
	}
	
	public List<Tipocredenciales> updateAll(List<Tipocredenciales> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipocredenciales entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipocredenciales> entities) {
		repo.deleteAll(entities);
	}
}
