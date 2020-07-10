package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Telefonoestadotipo;
import co.com.myproject.delivereatspersistence.entity.TelefonoestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ITelefonoEstadoTipoRepo;

@Service
public class TelefonoEstadoTipoServImpl implements ITelefonoEstadoTipoServ{
	@Autowired
	private ITelefonoEstadoTipoRepo repo;
	
	public List<Telefonoestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Telefonoestadotipo> findById(TelefonoestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Telefonoestadotipo getOne(TelefonoestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(TelefonoestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Telefonoestadotipo save(Telefonoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Telefonoestadotipo> saveAll(List<Telefonoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Telefonoestadotipo update(Telefonoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Telefonoestadotipo> updateAll(List<Telefonoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Telefonoestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Telefonoestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
