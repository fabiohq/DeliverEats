package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Formapagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.FormapagoestadotipoPK;

public interface IFormaPagoEstadoTipoRepo extends JpaRepository<Formapagoestadotipo, FormapagoestadotipoPK>{

}
