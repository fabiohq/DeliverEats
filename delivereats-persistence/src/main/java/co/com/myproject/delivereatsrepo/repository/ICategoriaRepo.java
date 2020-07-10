package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer>{

}
