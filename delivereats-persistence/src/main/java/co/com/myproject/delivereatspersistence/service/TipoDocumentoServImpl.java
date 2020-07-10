package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipodocumento;
import co.com.myproject.delivereatspersistence.repository.ITipoDocumentoRepo;

@Service
public class TipoDocumentoServImpl implements ITipoDocumentoServ{
	@Autowired
	private ITipoDocumentoRepo repo;
	
	public List<Tipodocumento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipodocumento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipodocumento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipodocumento save(Tipodocumento entity) {
		return repo.save(entity);
	}
	
	public List<Tipodocumento> saveAll(List<Tipodocumento> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipodocumento update(Tipodocumento entity) {
		return repo.save(entity);
	}
	
	public List<Tipodocumento> updateAll(List<Tipodocumento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipodocumento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipodocumento> entities) {
		repo.deleteAll(entities);
	}
}
