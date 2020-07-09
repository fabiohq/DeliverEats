package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Mailestadotipo;
import co.com.myproject.delivereatspersistence.entity.MailestadotipoPK;

public interface IMailEstadoTipoRepo extends JpaRepository<Mailestadotipo, MailestadotipoPK>{

}
