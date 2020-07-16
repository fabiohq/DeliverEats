package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Pedido;

public interface IPedidoServ {
	
	public Pedido getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Pedido save(Pedido entity) throws Exception;
	
	public List<Pedido> saveAll(List<Pedido> entities) throws Exception;
	
	public Pedido update(Pedido entity) throws Exception;
	
	public List<Pedido> updateAll(List<Pedido> entities) throws Exception;
	
	public void delete(Pedido entity) throws Exception;
	
	public void deleteAll(List<Pedido> entities) throws Exception;
}
