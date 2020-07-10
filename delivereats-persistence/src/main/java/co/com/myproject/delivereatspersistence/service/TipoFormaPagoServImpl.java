package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipoformapago;
import co.com.myproject.delivereatspersistence.repository.ITipoFormaPagoRepo;

@Service
public class TipoFormaPagoServImpl implements ITipoFormaPagoServ{
	@Autowired
	private ITipoFormaPagoRepo repo;
	
	public List<Tipoformapago> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipoformapago> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipoformapago getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipoformapago save(Tipoformapago entity) {
		return repo.save(entity);
	}
	
	public List<Tipoformapago> saveAll(List<Tipoformapago> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipoformapago update(Tipoformapago entity) {
		return repo.save(entity);
	}
	
	public List<Tipoformapago> updateAll(List<Tipoformapago> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipoformapago entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipoformapago> entities) {
		repo.deleteAll(entities);
	}
}
