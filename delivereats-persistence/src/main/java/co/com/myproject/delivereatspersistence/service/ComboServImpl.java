package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Combo;
import co.com.myproject.delivereatspersistence.repository.IComboRepo;

@Service
public class ComboServImpl implements IComboServ {

	@Autowired
	private IComboRepo repo;
	
	public List<Combo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Combo> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Combo getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Combo save(Combo entity) {
		return repo.save(entity);
	}
	
	public List<Combo> saveAll(List<Combo> entities) {
		return repo.saveAll(entities);
	}
	
	public Combo update(Combo entity) {
		return repo.save(entity);
	}
	
	public List<Combo> updateAll(List<Combo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Combo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Combo> entities) {
		repo.deleteAll(entities);
	}
}
