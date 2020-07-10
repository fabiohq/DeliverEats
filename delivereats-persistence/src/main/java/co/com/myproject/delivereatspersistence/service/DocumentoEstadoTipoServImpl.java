package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Documentoestadotipo;
import co.com.myproject.delivereatspersistence.entity.DocumentoestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IDocumentoEstadoTipoRepo;

@Service
public class DocumentoEstadoTipoServImpl implements IDocumentoEstadoTipoServ {

	@Autowired
	private IDocumentoEstadoTipoRepo repo;
	
	public List<Documentoestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Documentoestadotipo> findById(DocumentoestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Documentoestadotipo getOne(DocumentoestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(DocumentoestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Documentoestadotipo save(Documentoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Documentoestadotipo> saveAll(List<Documentoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Documentoestadotipo update(Documentoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Documentoestadotipo> updateAll(List<Documentoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Documentoestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Documentoestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
