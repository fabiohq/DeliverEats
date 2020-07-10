package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
