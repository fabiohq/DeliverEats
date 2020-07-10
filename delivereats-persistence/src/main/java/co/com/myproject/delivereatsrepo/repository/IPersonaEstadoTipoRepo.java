package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Personaestadotipo;
import co.com.myproject.delivereatsrepo.entity.PersonaestadotipoPK;

public interface IPersonaEstadoTipoRepo extends JpaRepository<Personaestadotipo, PersonaestadotipoPK>{

}
