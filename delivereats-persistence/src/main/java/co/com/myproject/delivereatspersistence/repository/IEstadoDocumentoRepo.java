package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Estadodocumento;

public interface IEstadoDocumentoRepo extends JpaRepository<Estadodocumento, Integer>{

}
