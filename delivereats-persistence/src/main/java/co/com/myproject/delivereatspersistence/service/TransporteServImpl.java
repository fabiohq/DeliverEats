package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Transporte;
import co.com.myproject.delivereatspersistence.repository.ITransporteRepo;

@Service
public class TransporteServImpl implements ITransporteServ{
	@Autowired
	private ITransporteRepo repo;
	
	public List<Transporte> findAll() {
		return repo.findAll();
	}
	
	public Optional<Transporte> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Transporte getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Transporte save(Transporte entity) {
		return repo.save(entity);
	}
	
	public List<Transporte> saveAll(List<Transporte> entities) {
		return repo.saveAll(entities);
	}
	
	public Transporte update(Transporte entity) {
		return repo.save(entity);
	}
	
	public List<Transporte> updateAll(List<Transporte> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Transporte entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Transporte> entities) {
		repo.deleteAll(entities);
	}
}
