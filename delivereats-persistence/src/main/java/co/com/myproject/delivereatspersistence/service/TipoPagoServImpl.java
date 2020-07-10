package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipopago;
import co.com.myproject.delivereatspersistence.repository.ITipoPagoRepo;

@Service
public class TipoPagoServImpl implements ITipoPagoServ{
	@Autowired
	private ITipoPagoRepo repo;
	
	public List<Tipopago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipopago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipopago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipopago save(Tipopago entity) {
		return repo.save(entity);
	}
	
	public List<Tipopago> saveAll(List<Tipopago> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipopago update(Tipopago entity) {
		return repo.save(entity);
	}
	
	public List<Tipopago> updateAll(List<Tipopago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipopago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipopago> entities) {
		repo.deleteAll(entities);
	}
}
