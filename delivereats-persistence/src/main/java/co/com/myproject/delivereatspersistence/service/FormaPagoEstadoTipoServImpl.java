package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Formapagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.FormapagoestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IFormaPagoEstadoTipoRepo;

@Service
public class FormaPagoEstadoTipoServImpl implements IFormaPagoEstadoTipoServ {

	@Autowired
	private IFormaPagoEstadoTipoRepo repo;
	
	public List<Formapagoestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Formapagoestadotipo> findById(FormapagoestadotipoPK id) {
		return repo.findById(id);
	}
		
	public Formapagoestadotipo save(Formapagoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Formapagoestadotipo> saveAll(List<Formapagoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Formapagoestadotipo update(Formapagoestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Formapagoestadotipo> updateAll(List<Formapagoestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Formapagoestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Formapagoestadotipo> entities) {
		repo.deleteAll(entities);
	}

	@Override
	public Formapagoestadotipo getOne(FormapagoestadotipoPK id) throws Exception {
		
		return repo.getOne(id);
	}

	@Override
	public boolean existsById(FormapagoestadotipoPK id) throws Exception {

		return repo.existsById(id);
	}
}
