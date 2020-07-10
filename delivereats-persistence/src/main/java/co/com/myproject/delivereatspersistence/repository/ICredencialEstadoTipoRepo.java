package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Credencialesestadotipo;
import co.com.myproject.delivereatspersistence.entity.CredencialesestadotipoPK;

public interface ICredencialEstadoTipoRepo extends JpaRepository<Credencialesestadotipo, CredencialesestadotipoPK>{

}
