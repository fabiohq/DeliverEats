package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.myproject.delivereatspersistence.entity.Estadoproducto;

public interface IEstadoProductoRepo extends JpaRepository<Estadoproducto, Integer>{

}
