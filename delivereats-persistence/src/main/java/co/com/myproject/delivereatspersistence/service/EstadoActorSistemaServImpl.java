package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadoactorsistema;
import co.com.myproject.delivereatspersistence.repository.IEstadoActorSistemaRepo;

@Service
public class EstadoActorSistemaServImpl implements IEstadoActorSistemaServ {

	@Autowired
	private IEstadoActorSistemaRepo repo;
	
	public List<Estadoactorsistema> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadoactorsistema> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadoactorsistema getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadoactorsistema save(Estadoactorsistema entity) {
		return repo.save(entity);
	}
	
	public List<Estadoactorsistema> saveAll(List<Estadoactorsistema> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadoactorsistema update(Estadoactorsistema entity) {
		return repo.save(entity);
	}
	
	public List<Estadoactorsistema> updateAll(List<Estadoactorsistema> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadoactorsistema entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadoactorsistema> entities) {
		repo.deleteAll(entities);
	}
}
