package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadodocumento;
import co.com.myproject.delivereatspersistence.repository.IEstadoDocumentoRepo;

@Service
public class EstadoDocumentoServImpl implements IEstadoDocumentoServ {

	@Autowired
	private IEstadoDocumentoRepo repo;
	
	public List<Estadodocumento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadodocumento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadodocumento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadodocumento save(Estadodocumento entity) {
		return repo.save(entity);
	}
	
	public List<Estadodocumento> saveAll(List<Estadodocumento> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadodocumento update(Estadodocumento entity) {
		return repo.save(entity);
	}
	
	public List<Estadodocumento> updateAll(List<Estadodocumento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadodocumento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadodocumento> entities) {
		repo.deleteAll(entities);
	}
}
