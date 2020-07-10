package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Transporteestadotipo;
import co.com.myproject.delivereatspersistence.entity.TransporteestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.ITransporteEstadoTipoRepo;

@Service
public class TransporteEstadoTipoServImpl implements ITransporteEstadoTipoServ{
	@Autowired
	private ITransporteEstadoTipoRepo repo;
	
	public List<Transporteestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Transporteestadotipo> findById(TransporteestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Transporteestadotipo getOne(TransporteestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(TransporteestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Transporteestadotipo save(Transporteestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Transporteestadotipo> saveAll(List<Transporteestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Transporteestadotipo update(Transporteestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Transporteestadotipo> updateAll(List<Transporteestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Transporteestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Transporteestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
