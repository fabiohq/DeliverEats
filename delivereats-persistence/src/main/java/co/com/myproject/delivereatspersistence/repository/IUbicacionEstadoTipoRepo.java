package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Ubicacionestadotipo;
import co.com.myproject.delivereatspersistence.entity.UbicacionestadotipoPK;

public interface IUbicacionEstadoTipoRepo extends JpaRepository<Ubicacionestadotipo, UbicacionestadotipoPK>{

}
