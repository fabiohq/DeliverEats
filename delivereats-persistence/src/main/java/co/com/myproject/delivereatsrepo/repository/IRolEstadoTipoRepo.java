package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Rolestadotipo;
import co.com.myproject.delivereatsrepo.entity.RolestadotipoPK;

public interface IRolEstadoTipoRepo extends JpaRepository<Rolestadotipo, RolestadotipoPK>{

}
