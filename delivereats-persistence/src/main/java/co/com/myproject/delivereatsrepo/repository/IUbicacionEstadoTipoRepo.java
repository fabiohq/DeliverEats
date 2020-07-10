package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Ubicacionestadotipo;
import co.com.myproject.delivereatsrepo.entity.UbicacionestadotipoPK;

public interface IUbicacionEstadoTipoRepo extends JpaRepository<Ubicacionestadotipo, UbicacionestadotipoPK>{

}
