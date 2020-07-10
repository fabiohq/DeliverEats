package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Tipopedido;
import co.com.myproject.delivereatspersistence.repository.ITipoPedidoRepo;

@Service
public class TipoPedidoServImpl implements ITipoPedidoServ{
	@Autowired
	private ITipoPedidoRepo repo;
	
	public List<Tipopedido> findAll() {
		return repo.findAll();
	}
	
	public Optional<Tipopedido> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Tipopedido getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Tipopedido save(Tipopedido entity) {
		return repo.save(entity);
	}
	
	public List<Tipopedido> saveAll(List<Tipopedido> entities) {
		return repo.saveAll(entities);
	}
	
	public Tipopedido update(Tipopedido entity) {
		return repo.save(entity);
	}
	
	public List<Tipopedido> updateAll(List<Tipopedido> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Tipopedido entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Tipopedido> entities) {
		repo.deleteAll(entities);
	}
}
