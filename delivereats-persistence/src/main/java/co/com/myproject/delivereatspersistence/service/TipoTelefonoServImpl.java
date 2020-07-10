package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipotelefono;
import co.com.myproject.delivereatspersistence.repository.ITipoTelefonoRepo;

@Service
public class TipoTelefonoServImpl implements ITipoTelefonoServ{
	@Autowired
	private ITipoTelefonoRepo repo;
	
	public List<Tipotelefono> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipotelefono> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipotelefono getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipotelefono save(Tipotelefono entity) {
		return repo.save(entity);
	}
	
	public List<Tipotelefono> saveAll(List<Tipotelefono> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipotelefono update(Tipotelefono entity) {
		return repo.save(entity);
	}
	
	public List<Tipotelefono> updateAll(List<Tipotelefono> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipotelefono entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipotelefono> entities) {
		repo.deleteAll(entities);
	}
}
