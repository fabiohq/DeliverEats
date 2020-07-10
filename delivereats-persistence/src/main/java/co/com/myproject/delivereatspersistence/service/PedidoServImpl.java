package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Pedido;
import co.com.myproject.delivereatspersistence.repository.IPedidoRepo;

@Service
public class PedidoServImpl implements IPedidoServ{
	@Autowired
	private IPedidoRepo repo;
	
	public List<Pedido> findAll() {
		return repo.findAll();
	}
	
	public Optional<Pedido> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Pedido getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Pedido save(Pedido entity) {
		return repo.save(entity);
	}
	
	public List<Pedido> saveAll(List<Pedido> entities) {
		return repo.saveAll(entities);
	}
	
	public Pedido update(Pedido entity) {
		return repo.save(entity);
	}
	
	public List<Pedido> updateAll(List<Pedido> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Pedido entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Pedido> entities) {
		repo.deleteAll(entities);
	}
}
