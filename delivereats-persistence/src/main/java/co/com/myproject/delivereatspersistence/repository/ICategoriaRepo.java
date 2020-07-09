package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer>{

}
