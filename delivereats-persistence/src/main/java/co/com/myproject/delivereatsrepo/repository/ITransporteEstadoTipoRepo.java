package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Transporteestadotipo;
import co.com.myproject.delivereatsrepo.entity.TransporteestadotipoPK;

public interface ITransporteEstadoTipoRepo extends JpaRepository<Transporteestadotipo, TransporteestadotipoPK>{

}
