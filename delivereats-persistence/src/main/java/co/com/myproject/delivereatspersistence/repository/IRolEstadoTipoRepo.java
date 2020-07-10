package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Rolestadotipo;
import co.com.myproject.delivereatspersistence.entity.RolestadotipoPK;

public interface IRolEstadoTipoRepo extends JpaRepository<Rolestadotipo, RolestadotipoPK>{

}
