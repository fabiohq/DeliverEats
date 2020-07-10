package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipotransporte;
import co.com.myproject.delivereatspersistence.repository.ITipoTransporteRepo;

@Service
public class TipoTransporteServImpl implements ITipoTransporteServ{
	@Autowired
	private ITipoTransporteRepo repo;
	
	public List<Tipotransporte> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipotransporte> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipotransporte getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipotransporte save(Tipotransporte entity) {
		return repo.save(entity);
	}
	
	public List<Tipotransporte> saveAll(List<Tipotransporte> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipotransporte update(Tipotransporte entity) {
		return repo.save(entity);
	}
	
	public List<Tipotransporte> updateAll(List<Tipotransporte> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipotransporte entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipotransporte> entities) {
		repo.deleteAll(entities);
	}
}
