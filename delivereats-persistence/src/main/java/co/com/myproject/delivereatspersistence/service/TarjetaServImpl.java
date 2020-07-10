package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tarjeta;
import co.com.myproject.delivereatspersistence.repository.ITarjetaRepo;

@Service
public class TarjetaServImpl implements ITarjetaServ{
	@Autowired
	private ITarjetaRepo repo;
	
	public List<Tarjeta> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tarjeta> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tarjeta getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tarjeta save(Tarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Tarjeta> saveAll(List<Tarjeta> entities) {
		return repo.saveAll(entities);
	}
	
	public Tarjeta update(Tarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Tarjeta> updateAll(List<Tarjeta> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tarjeta entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tarjeta> entities) {
		repo.deleteAll(entities);
	}
}
