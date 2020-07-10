package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Pago;
import co.com.myproject.delivereatspersistence.repository.IPagoRepo;

@Service
public class PagoServImpl implements IPagoServ{
	@Autowired
	private IPagoRepo repo;
	
	public List<Pago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Pago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Pago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Pago save(Pago entity) {
		return repo.save(entity);
	}
	
	public List<Pago> saveAll(List<Pago> entities) {
		return repo.saveAll(entities);
	}
	
	public Pago update(Pago entity) {
		return repo.save(entity);
	}
	
	public List<Pago> updateAll(List<Pago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Pago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Pago> entities) {
		repo.deleteAll(entities);
	}
}
