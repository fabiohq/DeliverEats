package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Actorsistemaestadotipo;
import co.com.myproject.delivereatspersistence.entity.ActorsistemaestadotipoPK;

public interface IActorsistemaestadotipoService {

public Optional<Actorsistemaestadotipo> findById(ActorsistemaestadotipoPK id) throws Exception;
	
	public Actorsistemaestadotipo getOne(ActorsistemaestadotipoPK id) throws Exception;
	
	public boolean existsById(ActorsistemaestadotipoPK id) throws Exception;
	
	public Actorsistemaestadotipo save(Actorsistemaestadotipo entity) throws Exception;
	
	public List<Actorsistemaestadotipo> saveAll(List<Actorsistemaestadotipo> entities) throws Exception;
	
	public Actorsistemaestadotipo update(Actorsistemaestadotipo entity) throws Exception;
	
	public List<Actorsistemaestadotipo> updateAll(List<Actorsistemaestadotipo> entities) throws Exception;
	
	public void delete(Actorsistemaestadotipo entity) throws Exception;
	
	public void deleteAll(List<Actorsistemaestadotipo> entities) throws Exception;
}
