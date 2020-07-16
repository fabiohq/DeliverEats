package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Pedidotipoestado;
import co.com.myproject.delivereatspersistence.entity.PedidotipoestadoPK;
import co.com.myproject.delivereatspersistence.repository.IPedidoTipoEstadoRepo;

@Service
public class PedidoTipoEstadoServImpl implements IPedidoTipoEstadoServ{
	@Autowired
	private IPedidoTipoEstadoRepo repo;
	
	public List<Pedidotipoestado> findAll() {
		return repo.findAll();
	}
	
	public Optional<Pedidotipoestado> findById(PedidotipoestadoPK id) {
		return repo.findById(id);
	}
	
	public Pedidotipoestado getOne(PedidotipoestadoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(PedidotipoestadoPK id) {
		return repo.existsById(id);
	}
	
	public Pedidotipoestado save(Pedidotipoestado entity) {
		return repo.save(entity);
	}
	
	public List<Pedidotipoestado> saveAll(List<Pedidotipoestado> entities) {
		return repo.saveAll(entities);
	}
	
	public Pedidotipoestado update(Pedidotipoestado entity) {
		return repo.save(entity);
	}
	
	public List<Pedidotipoestado> updateAll(List<Pedidotipoestado> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Pedidotipoestado entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Pedidotipoestado> entities) {
		repo.deleteAll(entities);
	}

	@Override
	public Pedidotipoestado getOne(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
