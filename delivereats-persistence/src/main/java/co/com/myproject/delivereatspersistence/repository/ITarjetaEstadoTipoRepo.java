package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Tarjetaestadotipo;
import co.com.myproject.delivereatspersistence.entity.TarjetaestadotipoPK;

public interface ITarjetaEstadoTipoRepo extends JpaRepository<Tarjetaestadotipo, TarjetaestadotipoPK>{

}
