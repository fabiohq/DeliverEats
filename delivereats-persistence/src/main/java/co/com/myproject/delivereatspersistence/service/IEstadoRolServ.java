package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Estadorol;

public interface IEstadoRolServ {

public Optional<Estadorol> findById(Integer id) throws Exception;
	
	public Estadorol getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadorol save(Estadorol entity) throws Exception;
	
	public List<Estadorol> saveAll(List<Estadorol> entities) throws Exception;
	
	public Estadorol update(Estadorol entity) throws Exception;
	
	public List<Estadorol> updateAll(List<Estadorol> entities) throws Exception;
	
	public void delete(Estadorol entity) throws Exception;
	
	public void deleteAll(List<Estadorol> entities) throws Exception;
}
