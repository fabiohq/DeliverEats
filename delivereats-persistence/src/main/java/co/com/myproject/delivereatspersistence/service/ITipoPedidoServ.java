package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipopedido;

public interface ITipoPedidoServ {
	
	public Tipopedido getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipopedido save(Tipopedido entity) throws Exception;
	
	public List<Tipopedido> saveAll(List<Tipopedido> entities) throws Exception;
	
	public Tipopedido update(Tipopedido entity) throws Exception;
	
	public List<Tipopedido> updateAll(List<Tipopedido> entities) throws Exception;
	
	public void delete(Tipopedido entity) throws Exception;
	
	public void deleteAll(List<Tipopedido> entities) throws Exception;
}
