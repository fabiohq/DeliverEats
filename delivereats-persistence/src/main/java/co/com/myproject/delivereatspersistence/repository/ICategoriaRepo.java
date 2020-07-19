package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Categoria;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;

public interface ICategoriaRepo extends JpaRepository<Categoria, CategoriaestadotipoPK>{

}
