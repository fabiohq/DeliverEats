package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.myproject.delivereatspersistence.entity.Estadomail;

public interface IEstadoMailRepo extends JpaRepository<Estadomail, Integer>{

}
