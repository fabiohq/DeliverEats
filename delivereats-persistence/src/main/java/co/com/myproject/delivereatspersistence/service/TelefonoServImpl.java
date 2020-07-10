package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Telefono;
import co.com.myproject.delivereatspersistence.repository.ITelefonoRepo;

@Service
public class TelefonoServImpl implements ITelefonoServ{
	@Autowired
	private ITelefonoRepo repo;
	
	public List<Telefono> findAll() {
		return repo.findAll();
	}
	
	public Optional<Telefono> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Telefono getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Telefono save(Telefono entity) {
		return repo.save(entity);
	}
	
	public List<Telefono> saveAll(List<Telefono> entities) {
		return repo.saveAll(entities);
	}
	
	public Telefono update(Telefono entity) {
		return repo.save(entity);
	}
	
	public List<Telefono> updateAll(List<Telefono> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Telefono entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Telefono> entities) {
		repo.deleteAll(entities);
	}
}
