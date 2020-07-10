package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Credencialesestadotipo;
import co.com.myproject.delivereatspersistence.entity.CredencialesestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ICredencialEstadoTipoRepo;

@Service
public class CredencialEstadoTipoServImpl implements ICredencialEstadoTipoServ {

	@Autowired
	private ICredencialEstadoTipoRepo repo;
	
	public List<Credencialesestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Credencialesestadotipo> findById(CredencialesestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Credencialesestadotipo getOne(CredencialesestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(CredencialesestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Credencialesestadotipo save(Credencialesestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Credencialesestadotipo> saveAll(List<Credencialesestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Credencialesestadotipo update(Credencialesestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Credencialesestadotipo> updateAll(List<Credencialesestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Credencialesestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Credencialesestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
