package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoformapago;
import co.com.myproject.delivereatspersistence.repository.IEstadoFormaPagoRepo;

@Service
public class EstadoFormaPagoServImpl implements IEstadoFormaPagoServ {

	@Autowired
	private IEstadoFormaPagoRepo repo;
	
	public List<Estadoformapago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoformapago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoformapago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoformapago save(Estadoformapago entity) {
		return repo.save(entity);
	}
	
	public List<Estadoformapago> saveAll(List<Estadoformapago> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoformapago update(Estadoformapago entity) {
		return repo.save(entity);
	}
	
	public List<Estadoformapago> updateAll(List<Estadoformapago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoformapago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoformapago> entities) {
		repo.deleteAll(entities);
	}
}
