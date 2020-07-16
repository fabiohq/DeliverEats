package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipoformapago;

public interface ITipoFormaPagoServ {
	
	public Tipoformapago getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipoformapago save(Tipoformapago entity) throws Exception;
	
	public List<Tipoformapago> saveAll(List<Tipoformapago> entities) throws Exception;
	
	public Tipoformapago update(Tipoformapago entity) throws Exception;
	
	public List<Tipoformapago> updateAll(List<Tipoformapago> entities) throws Exception;
	
	public void delete(Tipoformapago entity) throws Exception;
	
	public void deleteAll(List<Tipoformapago> entities) throws Exception;
}
