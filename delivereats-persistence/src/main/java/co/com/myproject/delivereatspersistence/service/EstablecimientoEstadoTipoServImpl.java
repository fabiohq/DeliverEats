package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Establecimientoestadotipo;
import co.com.myproject.delivereatspersistence.entity.EstablecimientoestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IEstablecimientoEstadoTipoRepo;

@Service
public class EstablecimientoEstadoTipoServImpl implements IEstablecimientoEstadoTipoServ {

	@Autowired
	private IEstablecimientoEstadoTipoRepo repo;
	
	public List<Establecimientoestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Establecimientoestadotipo> findById(EstablecimientoestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Establecimientoestadotipo getOne(EstablecimientoestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(EstablecimientoestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Establecimientoestadotipo save(Establecimientoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Establecimientoestadotipo> saveAll(List<Establecimientoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Establecimientoestadotipo update(Establecimientoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Establecimientoestadotipo> updateAll(List<Establecimientoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Establecimientoestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Establecimientoestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
