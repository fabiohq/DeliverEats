package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Documentoestadotipo;
import co.com.myproject.delivereatsrepo.entity.DocumentoestadotipoPK;

public interface IDocumentoEstadoTipoRepo extends JpaRepository<Documentoestadotipo, DocumentoestadotipoPK>{

}
