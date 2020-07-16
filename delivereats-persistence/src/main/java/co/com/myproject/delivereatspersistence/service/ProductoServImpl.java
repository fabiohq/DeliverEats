package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Producto;
import co.com.myproject.delivereatspersistence.entity.ProductoPK;
import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;
import co.com.myproject.delivereatspersistence.repository.IProductoRepo;

@Service
public class ProductoServImpl implements IProductoServ{
	@Autowired
	private IProductoRepo repo;
	
	public List<Producto> findAll() {
		return repo.findAll();
	}
	
	public Optional<Producto> findById(ProductoPK id) {
		return repo.findById(id);
	}
	
	public Producto getOne(ProductoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(ProductoPK id) {
		return repo.existsById(id);
	}
	
	public Producto save(Producto entity) {
		return repo.save(entity);
	}
	
	public List<Producto> saveAll(List<Producto> entities) {
		return repo.saveAll(entities);
	}
	
	public Producto update(Producto entity) {
		return repo.save(entity);
	}
	
	public List<Producto> updateAll(List<Producto> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Producto entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Producto> entities) {
		repo.deleteAll(entities);
	}
}
