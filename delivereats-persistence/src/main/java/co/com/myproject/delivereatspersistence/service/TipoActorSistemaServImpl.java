package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipoactorsistema;
import co.com.myproject.delivereatspersistence.repository.ITipoActorSistemaRepo;

@Service
public class TipoActorSistemaServImpl implements ITipoActorSistemaServ{
	@Autowired
	private ITipoActorSistemaRepo repo;
	
	public List<Tipoactorsistema> findAll() throws Exception{
		return repo.findAll();
	}
	
	public Optional<Tipoactorsistema> findById(Integer id) throws Exception {
		return repo.findById(id);
	}
	
	public Tipoactorsistema getOne(Integer id) throws Exception {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) throws Exception {
		return repo.existsById(id);
	}
	
	public Tipoactorsistema save(Tipoactorsistema entity) throws Exception {
		return repo.save(entity);
	}
	
	public List<Tipoactorsistema> saveAll(List<Tipoactorsistema> entities) throws Exception {
		return repo.saveAll(entities);
	}
	
	public Tipoactorsistema update(Tipoactorsistema entity) throws Exception {
		return repo.save(entity);
	}
	
	public List<Tipoactorsistema> updateAll(List<Tipoactorsistema> entities) throws Exception {
		return repo.saveAll(entities);
	}
	public void delete(Tipoactorsistema entity) throws Exception {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipoactorsistema> entities) throws Exception {
		repo.deleteAll(entities);
	}
}
