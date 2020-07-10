package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadotarjeta;
import co.com.myproject.delivereatspersistence.repository.IEstadoTarjetaRepo;

@Service
public class EstadoTarjetaServImpl implements IEstadoTarjetaServ {

	@Autowired
	private IEstadoTarjetaRepo repo;
	
	public List<Estadotarjeta> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadotarjeta> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadotarjeta getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadotarjeta save(Estadotarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Estadotarjeta> saveAll(List<Estadotarjeta> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadotarjeta update(Estadotarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Estadotarjeta> updateAll(List<Estadotarjeta> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadotarjeta entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadotarjeta> entities) {
		repo.deleteAll(entities);
	}
}
