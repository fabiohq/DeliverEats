package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Turnoestado;
import co.com.myproject.delivereatsrepo.entity.TurnoestadoPK;

public interface ITurnoEstadoRepo extends JpaRepository<Turnoestado, TurnoestadoPK>{

}
