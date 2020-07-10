package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Mailestadotipo;
import co.com.myproject.delivereatsrepo.entity.MailestadotipoPK;

public interface IMailEstadoTipoRepo extends JpaRepository<Mailestadotipo, MailestadotipoPK>{

}
