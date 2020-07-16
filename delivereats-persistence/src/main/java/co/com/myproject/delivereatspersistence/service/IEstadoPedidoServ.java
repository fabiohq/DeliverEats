package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadopedido;

public interface IEstadoPedidoServ {

	public List<Estadopedido> saveAll(List<Estadopedido> entities) throws Exception;
	
	public Estadopedido update(Estadopedido entity) throws Exception;
	
	public List<Estadopedido> updateAll(List<Estadopedido> entities) throws Exception;
	
	public void delete(Estadopedido entity) throws Exception;
	
	public void deleteAll(List<Estadopedido> entities) throws Exception;
}
