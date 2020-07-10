package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tarjetaestadotipo;
import co.com.myproject.delivereatspersistence.entity.TarjetaestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ITarjetaEstadoTipoRepo;

@Service
public class TarjetaEstadoTipoServImpl implements ITarjetaEstadoTipoServ{
	@Autowired
	private ITarjetaEstadoTipoRepo repo;
	
	public List<Tarjetaestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tarjetaestadotipo> findById(TarjetaestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Tarjetaestadotipo getOne(TarjetaestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(TarjetaestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Tarjetaestadotipo save(Tarjetaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Tarjetaestadotipo> saveAll(List<Tarjetaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Tarjetaestadotipo update(Tarjetaestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Tarjetaestadotipo> updateAll(List<Tarjetaestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tarjetaestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tarjetaestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
