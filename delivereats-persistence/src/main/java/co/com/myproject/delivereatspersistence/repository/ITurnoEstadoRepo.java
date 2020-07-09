package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Turnoestado;
import co.com.myproject.delivereatspersistence.entity.TurnoestadoPK;

public interface ITurnoEstadoRepo extends JpaRepository<Turnoestado, TurnoestadoPK>{

}
