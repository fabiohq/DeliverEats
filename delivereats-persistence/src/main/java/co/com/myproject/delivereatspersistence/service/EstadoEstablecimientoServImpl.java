package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoestablecimiento;
import co.com.myproject.delivereatspersistence.repository.IEstadoEstablecimientoRepo;

@Service
public class EstadoEstablecimientoServImpl implements IEstadoEstablecimientoServ {

	@Autowired
	private IEstadoEstablecimientoRepo repo;
	
	public List<Estadoestablecimiento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoestablecimiento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoestablecimiento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoestablecimiento save(Estadoestablecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Estadoestablecimiento> saveAll(List<Estadoestablecimiento> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoestablecimiento update(Estadoestablecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Estadoestablecimiento> updateAll(List<Estadoestablecimiento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoestablecimiento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoestablecimiento> entities) {
		repo.deleteAll(entities);
	}
}
