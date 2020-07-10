package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Estadopedido;
import co.com.myproject.delivereatspersistence.repository.IEstadoPedidoRepo;

@Service
public class EstadoPedidoServImpl implements IEstadoPedidoServ {

	@Autowired
	private IEstadoPedidoRepo repo;
	
	public List<Estadopedido> findAll() {
		return repo.findAll();
	}
	
	public Optional<Estadopedido> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Estadopedido getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Estadopedido save(Estadopedido entity) {
		return repo.save(entity);
	}
	
	public List<Estadopedido> saveAll(List<Estadopedido> entities) {
		return repo.saveAll(entities);
	}
	
	public Estadopedido update(Estadopedido entity) {
		return repo.save(entity);
	}
	
	public List<Estadopedido> updateAll(List<Estadopedido> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Estadopedido entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Estadopedido> entities) {
		repo.deleteAll(entities);
	}
}
