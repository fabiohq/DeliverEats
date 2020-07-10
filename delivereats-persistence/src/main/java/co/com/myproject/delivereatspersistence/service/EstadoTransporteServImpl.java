package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadotransporte;
import co.com.myproject.delivereatspersistence.repository.IEstadoTransporteRepo;

@Service
public class EstadoTransporteServImpl implements  IEstadoTransporteServ {

	@Autowired
	private IEstadoTransporteRepo repo;
	
	public List<Estadotransporte> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadotransporte> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadotransporte getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadotransporte save(Estadotransporte entity) {
		return repo.save(entity);
	}
	
	public List<Estadotransporte> saveAll(List<Estadotransporte> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadotransporte update(Estadotransporte entity) {
		return repo.save(entity);
	}
	
	public List<Estadotransporte> updateAll(List<Estadotransporte> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadotransporte entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadotransporte> entities) {
		repo.deleteAll(entities);
	}
}
