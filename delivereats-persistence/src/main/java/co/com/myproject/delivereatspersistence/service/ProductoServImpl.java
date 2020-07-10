package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;
import co.com.myproject.delivereatspersistence.repository.IProductosAdicionesRepo;

@Service
public class ProductoServImpl implements IProductoServ{
	@Autowired
	private IProductosAdicionesRepo repo;
	
	public List<Productoadiciones> findAll() {
		return repo.findAll();
	}
	
	public Optional<Productoadiciones> findById(ProductoadicionesPK id) {
		return repo.findById(id);
	}
	
	public Productoadiciones getOne(ProductoadicionesPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(ProductoadicionesPK id) {
		return repo.existsById(id);
	}
	
	public Productoadiciones save(Productoadiciones entity) {
		return repo.save(entity);
	}
	
	public List<Productoadiciones> saveAll(List<Productoadiciones> entities) {
		return repo.saveAll(entities);
	}
	
	public Productoadiciones update(Productoadiciones entity) {
		return repo.save(entity);
	}
	
	public List<Productoadiciones> updateAll(List<Productoadiciones> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Productoadiciones entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Productoadiciones> entities) {
		repo.deleteAll(entities);
	}
}
