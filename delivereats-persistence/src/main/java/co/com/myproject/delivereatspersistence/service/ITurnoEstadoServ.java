package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Turnoestado;
import co.com.myproject.delivereatspersistence.entity.TurnoestadoPK;

public interface ITurnoEstadoServ {
	
	public Turnoestado getOne(TurnoestadoPK id) throws Exception;
	
	public boolean existsById(TurnoestadoPK id) throws Exception;
	
	public Turnoestado save(Turnoestado entity) throws Exception;
	
	public List<Turnoestado> saveAll(List<Turnoestado> entities) throws Exception;
	
	public Turnoestado update(Turnoestado entity) throws Exception;
	
	public List<Turnoestado> updateAll(List<Turnoestado> entities) throws Exception;
	
	public void delete(Turnoestado entity) throws Exception;
	
	public void deleteAll(List<Turnoestado> entities) throws Exception;
}
