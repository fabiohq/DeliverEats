package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Telefonoestadotipo;
import co.com.myproject.delivereatsrepo.entity.TelefonoestadotipoPK;

public interface ITelefonoEstadoTipoRepo extends JpaRepository<Telefonoestadotipo, TelefonoestadotipoPK>{

}
