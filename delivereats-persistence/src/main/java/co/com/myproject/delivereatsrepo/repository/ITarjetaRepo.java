package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Tarjeta;

public interface ITarjetaRepo extends JpaRepository<Tarjeta, Integer>{

}