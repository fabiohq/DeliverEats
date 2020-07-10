package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadotelefono;
import co.com.myproject.delivereatspersistence.repository.IEstadoTelefonoRepo;


@Service
public class EstadoTelefonoServImpl implements IEstadoTelefonoServ {

	@Autowired
	private IEstadoTelefonoRepo repo;
	
	public List<Estadotelefono> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadotelefono> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadotelefono getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadotelefono save(Estadotelefono entity) {
		return repo.save(entity);
	}
	
	public List<Estadotelefono> saveAll(List<Estadotelefono> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadotelefono update(Estadotelefono entity) {
		return repo.save(entity);
	}
	
	public List<Estadotelefono> updateAll(List<Estadotelefono> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadotelefono entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadotelefono> entities) {
		repo.deleteAll(entities);
	}
}
