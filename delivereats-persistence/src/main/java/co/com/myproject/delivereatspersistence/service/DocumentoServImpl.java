package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Documento;
import co.com.myproject.delivereatspersistence.repository.IDocumentoRepo;

@Service
public class DocumentoServImpl  implements IDocumentoServ{

	@Autowired
	private IDocumentoRepo repo;
	
	public List<Documento> findAll() {
		return repo.findAll();
	}
	
	public Optional<Documento> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Documento getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Documento save(Documento entity) {
		return repo.save(entity);
	}
	
	public List<Documento> saveAll(List<Documento> entities) {
		return repo.saveAll(entities);
	}
	
	public Documento update(Documento entity) {
		return repo.save(entity);
	}
	
	public List<Documento> updateAll(List<Documento> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Documento entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Documento> entities) {
		repo.deleteAll(entities);
	}
}
