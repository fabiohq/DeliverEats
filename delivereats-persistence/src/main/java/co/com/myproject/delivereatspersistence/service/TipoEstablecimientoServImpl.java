package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipoestablecimiento;
import co.com.myproject.delivereatspersistence.repository.ITipoEstablecimientoRepo;

@Service
public class TipoEstablecimientoServImpl implements ITipoEstablecimientoServ{
	@Autowired
	private ITipoEstablecimientoRepo repo;
	
	public List<Tipoestablecimiento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipoestablecimiento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipoestablecimiento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipoestablecimiento save(Tipoestablecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Tipoestablecimiento> saveAll(List<Tipoestablecimiento> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipoestablecimiento update(Tipoestablecimiento entity) {
		return repo.save(entity);
	}
	
	public List<Tipoestablecimiento> updateAll(List<Tipoestablecimiento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipoestablecimiento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipoestablecimiento> entities) {
		repo.deleteAll(entities);
	}
}
