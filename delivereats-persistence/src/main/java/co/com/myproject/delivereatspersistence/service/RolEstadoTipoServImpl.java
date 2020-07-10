package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Rolestadotipo;
import co.com.myproject.delivereatspersistence.entity.RolestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IRolEstadoTipoRepo;

@Service
public class RolEstadoTipoServImpl implements IRolEstadoTipoServ{
	@Autowired
	private IRolEstadoTipoRepo repo;
	
	public List<Rolestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Rolestadotipo> findById(RolestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Rolestadotipo getOne(RolestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(RolestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Rolestadotipo save(Rolestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Rolestadotipo> saveAll(List<Rolestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Rolestadotipo update(Rolestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Rolestadotipo> updateAll(List<Rolestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Rolestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Rolestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
