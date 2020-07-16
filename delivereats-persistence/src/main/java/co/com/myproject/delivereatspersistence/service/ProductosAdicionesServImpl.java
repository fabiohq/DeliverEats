package co.com.myproject.delivereatspersistence.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;
import co.com.myproject.delivereatspersistence.repository.IProductosAdicionesRepo;

@Service
public class ProductosAdicionesServImpl implements IProductosAdicionesServ{
	@Autowired
	private IProductosAdicionesRepo repo;

	@Override
	public Productoadiciones getOne(ProductoadicionesPK id) throws Exception {
		return repo.getOne(id);
	}

	@Override
	public Productoadiciones save(Productoadiciones entity) throws Exception {
		return repo.save(entity);
	}

	@Override
	public List<Productoadiciones> saveAll(List<Productoadiciones> entities) throws Exception {
		return repo.saveAll(entities);
	}

	@Override
	public Productoadiciones update(Productoadiciones entity) throws Exception {
		return repo.save(entity);
	}

	@Override
	public List<Productoadiciones> updateAll(List<Productoadiciones> entities) throws Exception {
		return repo.saveAll(entities);
	}

	@Override
	public void delete(Productoadiciones entity) throws Exception {
		repo.delete(entity);
		
	}

	@Override
	public void deleteAll(List<Productoadiciones> entities) throws Exception {
		repo.deleteAll(entities);
		
	}

	

	
}
