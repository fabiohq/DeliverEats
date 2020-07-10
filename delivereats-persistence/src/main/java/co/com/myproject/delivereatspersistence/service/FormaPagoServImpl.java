package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Formapago;
import co.com.myproject.delivereatspersistence.repository.IFormaPagoRepo;

@Service
public class FormaPagoServImpl implements IFormaPagoServ{
	@Autowired
	private IFormaPagoRepo repo;
	
	public List<Formapago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Formapago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Formapago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Formapago save(Formapago entity) {
		return repo.save(entity);
	}
	
	public List<Formapago> saveAll(List<Formapago> entities) {
		return repo.saveAll(entities);
	}
	
	public Formapago update(Formapago entity) {
		return repo.save(entity);
	}
	
	public List<Formapago> updateAll(List<Formapago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Formapago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Formapago> entities) {
		repo.deleteAll(entities);
	}
}
