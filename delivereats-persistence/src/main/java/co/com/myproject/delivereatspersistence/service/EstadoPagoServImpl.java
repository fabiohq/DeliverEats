package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadopago;
import co.com.myproject.delivereatspersistence.repository.IEstadoPagoRepo;

@Service
public class EstadoPagoServImpl implements IEstadoPagoServ {

	@Autowired
	private IEstadoPagoRepo repo;
	
	public List<Estadopago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadopago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadopago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadopago save(Estadopago entity) {
		return repo.save(entity);
	}
	
	public List<Estadopago> saveAll(List<Estadopago> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadopago update(Estadopago entity) {
		return repo.save(entity);
	}
	
	public List<Estadopago> updateAll(List<Estadopago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadopago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadopago> entities) {
		repo.deleteAll(entities);
	}
}
