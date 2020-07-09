package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Documentoestadotipo;
import co.com.myproject.delivereatspersistence.entity.DocumentoestadotipoPK;

public interface IDocumentoEstadoTipoRepo extends JpaRepository<Documentoestadotipo, DocumentoestadotipoPK>{

}
