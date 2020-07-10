package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Tarjetaestadotipo;
import co.com.myproject.delivereatsrepo.entity.TarjetaestadotipoPK;

public interface ITarjetaEstadoTipoRepo extends JpaRepository<Tarjetaestadotipo, TarjetaestadotipoPK>{

}
