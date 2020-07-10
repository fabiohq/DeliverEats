package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Establecimiento;
import co.com.myproject.delivereatspersistence.repository.IEstablecimientoRepo;

@Service
public class EstablecimientoServImpl implements IEstablecimientoServ {

	@Autowired
	private IEstablecimientoRepo repo;
	
	public List<Establecimiento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Establecimiento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Establecimiento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Establecimiento save(Establecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Establecimiento> saveAll(List<Establecimiento> entities) {
		return repo.saveAll(entities);
	}
	
	public Establecimiento update(Establecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Establecimiento> updateAll(List<Establecimiento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Establecimiento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Establecimiento> entities) {
		repo.deleteAll(entities);
	}
}
