package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Categoriaestadotipo;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;

public interface ICategoriaEstadotipoRepo extends JpaRepository<Categoriaestadotipo,CategoriaestadotipoPK>{

}
