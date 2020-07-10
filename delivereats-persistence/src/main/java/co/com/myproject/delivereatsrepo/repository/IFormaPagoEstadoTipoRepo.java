package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Formapagoestadotipo;
import co.com.myproject.delivereatsrepo.entity.FormapagoestadotipoPK;

public interface IFormaPagoEstadoTipoRepo extends JpaRepository<Formapagoestadotipo, FormapagoestadotipoPK>{

}
