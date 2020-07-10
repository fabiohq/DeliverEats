package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Turnoestado;
import co.com.myproject.delivereatspersistence.entity.TurnoestadoPK;
import co.com.myproject.delivereatspersistence.repository.ITurnoEstadoRepo;

@Service
public class TurnoEstadoServImpl implements ITurnoEstadoServ{
	@Autowired
	private ITurnoEstadoRepo repo;
	
	public List<Turnoestado> findAll() {
		return repo.findAll();
	}
	
	public Optional<Turnoestado> findById(TurnoestadoPK id) {
		return repo.findById(id);
	}
	
	public Turnoestado getOne(TurnoestadoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(TurnoestadoPK id) {
		return repo.existsById(id);
	}
	
	public Turnoestado save(Turnoestado entity) {
		return repo.save(entity);
	}
	
	public List<Turnoestado> saveAll(List<Turnoestado> entities) {
		return repo.saveAll(entities);
	}
	
	public Turnoestado update(Turnoestado entity) {
		return repo.save(entity);
	}
	
	public List<Turnoestado> updateAll(List<Turnoestado> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Turnoestado entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Turnoestado> entities) {
		repo.deleteAll(entities);
	}
}
