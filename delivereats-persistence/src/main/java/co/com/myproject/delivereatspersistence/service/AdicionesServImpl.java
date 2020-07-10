package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Adiciones;
import co.com.myproject.delivereatspersistence.repository.IAdicionesRepo;

@Service
public class AdicionesServImpl implements IAdicionesServ{

	@Autowired
	private IAdicionesRepo repo;
	
	public List<Adiciones> findAll() {
		return repo.findAll();
	}
	
	public Optional<Adiciones> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Adiciones getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Adiciones save(Adiciones entity) {
		return repo.save(entity);
	}
	
	public List<Adiciones> saveAll(List<Adiciones> entities) {
		return repo.saveAll(entities);
	}
	
	public Adiciones update(Adiciones entity) {
		return repo.save(entity);
	}
	
	public List<Adiciones> updateAll(List<Adiciones> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Adiciones entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Adiciones> entities) {
		repo.deleteAll(entities);
	}
}
