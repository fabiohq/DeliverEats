package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Personaestadotipo;
import co.com.myproject.delivereatspersistence.entity.PersonaestadotipoPK;

public interface IPersonaEstadoTipoRepo extends JpaRepository<Personaestadotipo, PersonaestadotipoPK>{

}
