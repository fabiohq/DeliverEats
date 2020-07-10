package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipomail;
import co.com.myproject.delivereatspersistence.repository.ITipoMailRepo;

@Service
public class TipoMailServImpl implements ITipoMailServ{
	@Autowired
	private ITipoMailRepo repo;
	
	public List<Tipomail> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipomail> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipomail getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipomail save(Tipomail entity) {
		return repo.save(entity);
	}
	
	public List<Tipomail> saveAll(List<Tipomail> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipomail update(Tipomail entity) {
		return repo.save(entity);
	}
	
	public List<Tipomail> updateAll(List<Tipomail> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipomail entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipomail> entities) {
		repo.deleteAll(entities);
	}
}
