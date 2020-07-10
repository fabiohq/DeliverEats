package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Pagoestadotipo;
import co.com.myproject.delivereatsrepo.entity.PagoestadotipoPK;

public interface IPagoEstadoTipoRepo extends JpaRepository<Pagoestadotipo, PagoestadotipoPK>{

}
