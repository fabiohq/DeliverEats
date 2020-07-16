package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Pedidotipoestado;

public interface IPedidoTipoEstadoServ {
	
	public Pedidotipoestado getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Pedidotipoestado save(Pedidotipoestado entity) throws Exception;
	
	public List<Pedidotipoestado> saveAll(List<Pedidotipoestado> entities) throws Exception;
	
	public Pedidotipoestado update(Pedidotipoestado entity) throws Exception;
	
	public List<Pedidotipoestado> updateAll(List<Pedidotipoestado> entities) throws Exception;
	
	public void delete(Pedidotipoestado entity) throws Exception;
	
	public void deleteAll(List<Pedidotipoestado> entities) throws Exception;
}
