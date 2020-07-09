package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Transporteestadotipo;
import co.com.myproject.delivereatspersistence.entity.TransporteestadotipoPK;

public interface ITransporteEstadoTipoRepo extends JpaRepository<Transporteestadotipo, TransporteestadotipoPK>{

}
