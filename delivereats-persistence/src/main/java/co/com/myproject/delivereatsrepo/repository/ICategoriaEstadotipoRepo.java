package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Categoriaestadotipo;
import co.com.myproject.delivereatsrepo.entity.CategoriaestadotipoPK;

public interface ICategoriaEstadotipoRepo extends JpaRepository<Categoriaestadotipo,CategoriaestadotipoPK>{

}
