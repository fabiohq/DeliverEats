package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Productocombo;
import co.com.myproject.delivereatspersistence.entity.ProductocomboPK;
import co.com.myproject.delivereatspersistence.repository.IProductoComboRepo;

@Service
public class ProductoComboServImpl implements IProductoComboServ{
	@Autowired
	private IProductoComboRepo repo;
	
	public List<Productocombo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Productocombo> findById(ProductocomboPK id) {
		return repo.findById(id);
	}
	
	public Productocombo getOne(ProductocomboPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(ProductocomboPK id) {
		return repo.existsById(id);
	}
	
	public Productocombo save(Productocombo entity) {
		return repo.save(entity);
	}
	
	public List<Productocombo> saveAll(List<Productocombo> entities) {
		return repo.saveAll(entities);
	}
	
	public Productocombo update(Productocombo entity) {
		return repo.save(entity);
	}
	
	public List<Productocombo> updateAll(List<Productocombo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Productocombo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Productocombo> entities) {
		repo.deleteAll(entities);
	}

	@Override
	public Productocombo getOne(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
