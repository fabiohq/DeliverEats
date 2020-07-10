package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Pagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.PagoestadotipoPK;

public interface IPagoEstadoTipoRepo extends JpaRepository<Pagoestadotipo, PagoestadotipoPK>{

}
