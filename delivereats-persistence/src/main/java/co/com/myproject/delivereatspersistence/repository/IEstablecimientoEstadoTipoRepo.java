/**
 * 
 */
package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Establecimientoestadotipo;
import co.com.myproject.delivereatspersistence.entity.EstablecimientoestadotipoPK;

/**
 * @author fabio
 *
 */
public interface IEstablecimientoEstadoTipoRepo extends JpaRepository<Establecimientoestadotipo, EstablecimientoestadotipoPK>{

}
