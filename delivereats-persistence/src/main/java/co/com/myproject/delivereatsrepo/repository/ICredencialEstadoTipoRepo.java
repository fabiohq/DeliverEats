package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Credencialesestadotipo;
import co.com.myproject.delivereatsrepo.entity.CredencialesestadotipoPK;

public interface ICredencialEstadoTipoRepo extends JpaRepository<Credencialesestadotipo, CredencialesestadotipoPK>{

}
