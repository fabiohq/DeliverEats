package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Ubicacionestadotipo;
import co.com.myproject.delivereatspersistence.entity.UbicacionestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IUbicacionEstadoTipoRepo;

@Service
public class UbicacionEstadoTipoServImpl implements IUbicacionEstadoTipoServ{
	@Autowired
	private IUbicacionEstadoTipoRepo repo;
	
	public List<Ubicacionestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Ubicacionestadotipo> findById(UbicacionestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Ubicacionestadotipo getOne(UbicacionestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(UbicacionestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Ubicacionestadotipo save(Ubicacionestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Ubicacionestadotipo> saveAll(List<Ubicacionestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Ubicacionestadotipo update(Ubicacionestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Ubicacionestadotipo> updateAll(List<Ubicacionestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Ubicacionestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Ubicacionestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
