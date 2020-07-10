package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipocategoria;
import co.com.myproject.delivereatspersistence.repository.ITipoCategoriaRepo;

@Service
public class TipoCategoriaServImpl implements ITipoCategoriaServ{
	@Autowired
	private ITipoCategoriaRepo repo;
	
	public List<Tipocategoria> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipocategoria> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipocategoria getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipocategoria save(Tipocategoria entity) {
		return repo.save(entity);
	}
	
	public List<Tipocategoria> saveAll(List<Tipocategoria> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipocategoria update(Tipocategoria entity) {
		return repo.save(entity);
	}
	
	public List<Tipocategoria> updateAll(List<Tipocategoria> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipocategoria entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipocategoria> entities) {
		repo.deleteAll(entities);
	}
}
