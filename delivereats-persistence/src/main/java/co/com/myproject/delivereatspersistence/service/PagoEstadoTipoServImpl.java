package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Pagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.PagoestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IPagoEstadoTipoRepo;

@Service
public class PagoEstadoTipoServImpl implements IPagoEstadoTipoServ{
	@Autowired
	private IPagoEstadoTipoRepo repo;
	
	public List<Pagoestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Pagoestadotipo> findById(PagoestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Pagoestadotipo getOne(PagoestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(PagoestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Pagoestadotipo save(Pagoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Pagoestadotipo> saveAll(List<Pagoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Pagoestadotipo update(Pagoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Pagoestadotipo> updateAll(List<Pagoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Pagoestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Pagoestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
