/**
 * 
 */
package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Establecimientoestadotipo;
import co.com.myproject.delivereatsrepo.entity.EstablecimientoestadotipoPK;

/**
 * @author fabio
 *
 */
public interface IEstablecimientoEstadoTipoRepo extends JpaRepository<Establecimientoestadotipo, EstablecimientoestadotipoPK>{

}
