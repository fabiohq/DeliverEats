package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipotarjeta;
import co.com.myproject.delivereatspersistence.repository.ITipoTarjetaRepo;

@Service
public class TipoTarjetaServImpl implements ITipoTarjetaServ{
	@Autowired
	private ITipoTarjetaRepo repo;
	
	public List<Tipotarjeta> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipotarjeta> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipotarjeta getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipotarjeta save(Tipotarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Tipotarjeta> saveAll(List<Tipotarjeta> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipotarjeta update(Tipotarjeta entity) {
		return repo.save(entity);
	}
	
	public List<Tipotarjeta> updateAll(List<Tipotarjeta> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipotarjeta entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipotarjeta> entities) {
		repo.deleteAll(entities);
	}
}
